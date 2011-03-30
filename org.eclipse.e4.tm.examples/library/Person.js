function getFirstName() {
	return getNames(this.name, 0, 1);		
}

function getLastName() {
	return getNames(this.name, -2, -1);		
}
