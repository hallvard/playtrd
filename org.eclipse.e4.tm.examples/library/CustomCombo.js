function onSetDataObject(notification) { 
//	java.lang.System.out.println("CustomCombo.onSetDataObject this.dataObject=" + this.dataObject);
	this.update();
}

function update() {
//	java.lang.System.out.println("CustomCombo.update this.dataObject=" + this.dataObject);
}

var noSelection = "<none>";

function onSetText(notification) {
//	java.lang.System.out.println("CustomCombo.onSetText this.text=" + this.text);
	this.eSetDeliver(false);
	try {
		this.updateList();
	} finally {
		this.eSetDeliver(true);
	}
}

function getAllEObjects(uod) {
	return new java.util.ArrayList();
}

function getLabel(eObject) {
	return eObject.name;
}

function updateList() {
	var uodControl = this.findContainer(function (control) { return control.dataObject != null && control.dataObject.isA($library.$UoD);});
	if (this.dataObject != null && uodControl != null && this.text.length > 0) {
		var allEObjects = this.getAllEObjects(uodControl.dataObject);
//		java.lang.System.out.println("CustomCombo.updateList allEObject=" + allEObjects);
		var name = trimLeft(this.text);
		var eObjects = getEObjectsByName(allEObjects, name);
//		java.lang.System.out.println("CustomCombo.updateList eObject=" + eObjects);
		if (eObjects.size() == 0) {
			eObjects = allEObjects;
		}
		var names = eObjects.mapList(this.getLabel);
		names.add(0, noSelection);
//		java.lang.System.out.println("CustomCombo.updateList names=" + names);
		if (names != this.items) {
			this.items.clear();
			this.eSetDeliver(true);
			this.items.addAll(names);
		}
		this.autoSetProperty(this.dataObject, name, eObjects);
	}
}

function autoSetProperty() {
}

function trimLeft(s) {
	var i = 0;
	while (i < s.length) {
		if (s.charAt(i) != ' ') {
			return (i > 0 ? s.substring(i, s.length) : s);
		}
		i++;
	}
	return "";
} 

function startsWith(s1, s2) {
	return (s1.length >= s2.length && s1.substring(0, s2.length) == s2);
}

function getEObjectsByName(eObjects, name) {
	var labelFun = this.getLabel;
	java.lang.System.out.println("CustomCombo.getEObjectsByName eObjects=" + eObjects);
	var matches = eObjects.findMany(function (eObject) { return labelFun(eObject) == name;}, 0);
	if (matches.size() == 0) {
		matches = eObjects.findMany(function (eObject) { return startsWith(labelFun(eObject), name);});
	}
	return matches;
}
