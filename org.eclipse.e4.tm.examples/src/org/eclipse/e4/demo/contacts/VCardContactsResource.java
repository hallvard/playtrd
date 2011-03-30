/*******************************************************************************
 * Copyright (c) 2009 Siemens AG and others.
 * 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Kai Toedter - initial implementation
 *     Hallvard Traetteberg - Resource subclassing
 ******************************************************************************/
package org.eclipse.e4.demo.contacts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Map;

import org.eclipse.e4.tm.examples.contacts.Address;
import org.eclipse.e4.tm.examples.contacts.Contact;
import org.eclipse.e4.tm.examples.contacts.ContactsFactory;
import org.eclipse.e4.tm.examples.contacts.ContactsPackage;
import org.eclipse.e4.tm.examples.contacts.PhoneNumber;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

public class VCardContactsResource extends ResourceImpl {

	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		getContents().add(readFromVCard(inputStream));
	}

	protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
		saveAsVCard((Contact)getContents().get(0), outputStream);
	}

	public VCardContactsResource() {
	}

	private void saveAsVCard(Contact contact, OutputStream outputStream) {
		String charSet = "CHARSET="
				+ java.nio.charset.Charset.defaultCharset().name();
		String vCard = "BEGIN:VCARD" + "\nVERSION:2.1" + "\nN;" + charSet + ":"
				+ contact.getLastName() + ";" + contact.getFirstName()
				+ "\nFN;" + charSet + ":" + contact.getFirstName() + " "
				+ contact.getLastName() + "\nORG;" + charSet + ":"
				+ contact.getCompany() + "\nTITLE:" + contact.getJobTitle()
				+ "\nTEL;WORK;VOICE:" + contact.getPhone()
				+ "\nTEL;CELL;VOICE:" + contact.getMobile() + "\nADR;WORK;"
				+ charSet + ":" + ";;" + contact.getWorkAddress().getStreet() + ";"
				+ contact.getWorkAddress().getCity() + ";" + contact.getWorkAddress().getState() + ";"
				+ contact.getWorkAddress().getZipCode() + ";" + contact.getWorkAddress().getCountry() + "\nURL;WORK:"
				+ contact.getWebPage() + "\nEMAIL;PREF;INTERNET:"
				+ contact.getEmail() + "\nEND:VCARD\n";

		PrintWriter out = new PrintWriter(outputStream);
		out.println(vCard);
		out.close();
	}

	/**
	 * Reads a Contact from a VCard. This method cannot parse a generic VCard,
	 * but can only parse VCards created with Microsoft Outlook. The intention
	 * is not to provide a generic VCard reader but an easy way to get contact
	 * data (including pictures) in the repository.
	 * 
	 * @param fileName
	 *            the vcard file
	 * @return the created Contact
	 */
	public Contact readFromVCard(InputStream inputStream) {
		ContactsFactory contactsFactory = ContactsPackage.eINSTANCE.getContactsFactory();
		Contact contact = contactsFactory.createContact();
		BufferedReader bufferedReader = null;
		String charSet = "Windows-1252";

		// First try to guess the char set
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				int index = line.indexOf("CHARSET=");
				if (index != -1) {
					int endIndex = index + 8;
					while (line.charAt(endIndex) != ':'
							&& line.charAt(endIndex) != ';') {
						endIndex += 1;
					}
					charSet = line.substring(index + 8, endIndex);
					break;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// Then parse the vCard
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			String line;
			String value;
			while ((line = bufferedReader.readLine()) != null) {
				value = getVCardValue(line, "N");
				if (value != null) {
					String[] result = value.split(";");

					if (result.length > 0) {
						contact.setLastName(result[0]);
					}
					if (result.length > 1) {
						contact.setFirstName(result[1]);
					}
					if (result.length > 2) {
						contact.setMiddleName(result[2]);
					}
					if (result.length > 3) {
						contact.setTitle(result[3]);
					}
					continue;
				}
				value = getVCardValue(line, "TEL;WORK");
				if (value != null) {
					PhoneNumber phone = contactsFactory.createPhoneNumber();
					phone.setNumber(value);
					contact.setPhone(phone);
					continue;
				}
				value = getVCardValue(line, "TEL;CELL");
				if (value != null) {
					PhoneNumber mobile = contactsFactory.createPhoneNumber();
					mobile.setNumber(value);
					contact.setMobile(mobile);
					continue;
				}
				value = getVCardValue(line, "ADR;WORK");
				if (value != null) {
					Address workAddress = contactsFactory.createAddress();
					String[] result = value.split(";");

					if (result.length > 2) {
						workAddress.setStreet(result[2]);
					}
					if (result.length > 3) {
						workAddress.setCity(result[3]);
					}
					if (result.length > 4) {
						workAddress.setState(result[4]);
					}
					if (result.length > 5) {
						workAddress.setZipCode(result[5]);
					}
					if (result.length > 6) {
						workAddress.setCountry(result[6]);
					}
					contact.setWorkAddress(workAddress);
					continue;
				}
				value = getVCardValue(line, "EMAIL;PREF;INTERNET");
				if (value != null) {
					contact.setEmail(value);
					continue;
				}
				value = getVCardValue(line, "URL;WORK");
				if (value != null) {
					contact.setWebPage(value);
					continue;
				}
				value = getVCardValue(line, "ORG");
				if (value != null) {
					contact.setCompany(value);
					continue;
				}
				value = getVCardValue(line, "TITLE");
				if (value != null) {
					contact.setJobTitle(value);
					continue;
				}
				value = getVCardValue(line, "NOTE");
				if (value != null) {
					contact.setNote(value);
					continue;
				}
				value = getVCardValue(line, "PHOTO;TYPE=JPEG;ENCODING=BASE64");
				if (value != null) {
					line = bufferedReader.readLine();
					String base64 = "";
					while (line != null && line.length() > 0
							&& line.charAt(0) == ' ') {
						base64 += line.trim();
						line = bufferedReader.readLine();
					}
//					byte[] imageBytes = Base64.decode(base64.getBytes());
//					ByteArrayInputStream is = new ByteArrayInputStream(
//							imageBytes);
//					ImageData imageData = new ImageData(is);
//					contact
//							.setImage(new Image(Display.getCurrent(), imageData));
					continue;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return contact;
	}

	private String getVCardValue(String line, String token) {
		if (line.startsWith(token + ":") || line.startsWith(token + ";")) {
			String value = line.substring(line.indexOf(":") + 1);
			return value;
		}
		return null;
	}
}
