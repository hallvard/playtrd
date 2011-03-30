function getLoansForPerson(person) {
	var loans = new java.util.ArrayList();
	var libraries = this.allLibraries.iterator();
	while (libraries.hasNext()) {
		loans.addAll(libraries.next().getLoansForPerson(person));
	}
	return loans;
}

function initUoDcontent(object, name, prop) {
	if (name != null) {
    	object.name = name;
    }
	this[prop].add(object);
	return object;
}

function createPerson(name) {
	return this.initUoDcontent($library.$Person.create(), name, 'allPersons');
}

function createLibrary(name) {
	return this.initUoDcontent($library.$Library.create(), name, 'allLibraries');
}

function createAuthor(name) {
	return this.initUoDcontent($library.$Author.create(), name, 'allAuthors');
}
