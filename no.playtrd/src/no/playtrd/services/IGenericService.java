package no.playtrd.services;

import no.playtrd.v10.playtrd.Service;

import org.eclipse.emf.edit.domain.IEditingDomainProvider;

public interface IGenericService<T extends Service> {
	public void handleService(T serviceData, IEditingDomainProvider editingDomainProvider);
}
