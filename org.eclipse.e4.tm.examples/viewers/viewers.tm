<?xml version="1.0" encoding="ASCII"?>
<tm.widgets:Composite xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:tm.layouts="http://www.eclipse.org/e4/tm/layouts.ecore" xmlns:tm.widgets="http://www.eclipse.org/e4/tm/widgets.ecore" scriptSource="function init() {&#xA;&#x9;loadEPackage(&quot;platform:/resource/org.eclipse.e4.tm.examples/viewers/viewers.ecore&quot;, &quot;platform:/resource/org.eclipse.e4.tm.examples/viewers/viewers.ecore&quot;);&#xA;&#x9;supportNotifications(this);&#xA;&#x9;this.update();&#xA;}&#xA;&#xA;function onSetDataObject(notification) {&#xA;&#x9;this.update();&#xA;}&#xA;&#xA;function update() {&#xA;&#x9;var viewerInput = this.dataObject;&#xA;&#x9;var listViewerInput = (viewerInput != null &amp;&amp; viewerInput.listInputs.size() > 0 ? viewerInput.listInputs[0] : null);&#xA;&#x9;this.$listViewer.dataObject = listViewerInput;&#xA;&#x9;var treeViewerInput = (viewerInput != null &amp;&amp; viewerInput.treeInputs.size() > 0  ? viewerInput.treeInputs[0] : null);&#xA;&#x9;this.$treeViewer.dataObject = treeViewerInput;&#xA;&#x9;var tableViewerInput = (viewerInput != null &amp;&amp; viewerInput.tableInputs.size() > 0  ? viewerInput.tableInputs[0] : null);&#xA;&#x9;this.$tableViewer.dataObject = tableViewerInput;&#xA;}" name="aComposite">
  <controls xsi:type="tm.widgets:ListViewer" name="listViewer">
    <layoutData xsi:type="tm.layouts:RectangleLayoutData" x="20" y="20" width="200" height="100"/>
    <viewProvider xsi:type="tm.widgets:Label" scriptSource="function onSetDataObject(notification) {&#xA;&#x9;this.text = this.dataObject.label;&#xA;}" text="label 4"/>
    <contentProvider scriptSource="function onSetDataObject(notification) {&#xA;&#x9;this.dataObjects.clear();&#xA;&#x9;this.dataObjects.addAll(this.dataObject.elements);&#xA;}"/>
  </controls>
  <controls xsi:type="tm.widgets:TreeViewer" name="treeViewer">
    <layoutData xsi:type="tm.layouts:RectangleLayoutData" x="20" y="140" width="200" height="120"/>
    <viewProvider xsi:type="tm.widgets:Label" scriptSource="function onSetDataObject(notification) {&#xA;&#x9;this.text = this.dataObject.label;&#xA;}" text="label 2"/>
    <contentProvider scriptSource="function onSetDataObject(notification) {&#xA;&#x9;this.dataObjects.clear();&#xA;&#x9;if (this.dataObject.isA($viewers.$TreeViewerInput)) {&#xA;&#x9;&#x9;this.leaf = false;&#xA;&#x9;&#x9;this.dataObjects.addAll(this.dataObject.elements);&#xA;&#x9;} else if (this.dataObject.isA($viewers.$TreeViewerElement)) {&#xA;&#x9;&#x9;this.leaf = false;&#xA;&#x9;&#x9;this.dataObjects.addAll(this.dataObject.children);&#xA;&#x9;} else {&#xA;&#x9;&#x9;this.leaf = true;&#xA;&#x9;}&#xA;}"/>
  </controls>
  <controls xsi:type="tm.widgets:TableViewer" name="tableViewer">
    <layoutData xsi:type="tm.layouts:RectangleLayoutData" x="20" y="300" width="200" height="220"/>
    <viewProviders xsi:type="tm.widgets:Label" scriptSource="function onSetDataObject(notification) {&#xA;&#x9;this.text = (this.dataObject == null ? &quot;Name&quot; : this.dataObject.name);&#xA;}" text="null"/>
    <viewProviders xsi:type="tm.widgets:Label" scriptSource="function onSetDataObject(notification) {&#xA;&#x9;this.text = (this.dataObject == null ? &quot;Label&quot; : this.dataObject.label);&#xA;}" text="null"/>
    <contentProvider scriptSource="function onSetDataObject(notification) {&#xA;&#x9;this.dataObjects.clear();&#xA;&#x9;this.dataObjects.addAll(this.dataObject.elements);&#xA;}"/>
  </controls>
  <layout xsi:type="tm.layouts:RectangleLayout"/>
</tm.widgets:Composite>
