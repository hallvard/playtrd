function getLoansForPerson(person) {
	var personLoans = new java.util.ArrayList();
	var loans = library.loans.iterator();
	while (loans.hasNext()) {
		var loan = loans.next();
		if (loan.borrower == person) {
			personLoans.add(person);
		}
	}
	return personLoans;
}
