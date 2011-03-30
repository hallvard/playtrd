<?xml version="1.0" encoding="ASCII"?>
<tm.widgets:Composite xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:swt.layouts="http://www.eclipse.org/e4/swt/layouts.ecore" xmlns:tm.styles="http://www.eclipse.org/e4/tm/styles.ecore" xmlns:tm.widgets="http://www.eclipse.org/e4/tm/widgets.ecore" name="loginComposite" scriptSource="function init() {&#xA;&#x9;supportNotifications(this);&#xA;}">
  <style>
    <styleItems xsi:type="tm.styles:ColorItem" name="white" source="white"/>
    <styleItems xsi:type="tm.styles:ColorItem" name="invalid" source="#ff0000"/>
    <styleSelectors property="background" selector="white"/>
  </style>
  <controls xsi:type="tm.widgets:Label" name="usernameLabel" text="User name:">
    <style>
      <styleSelectors property="background" selector="white"/>
    </style>
  </controls>
  <controls xsi:type="tm.widgets:Text" name="usernameText" scriptSource="function onSetText(notification) {&#xA;&#x9;var i = 0;&#xA;&#x9;while (i &lt; this.text.length) {&#xA;&#x9;&#x9;var c = this.text.charAt(i);&#xA;&#x9;&#x9;if (! java.lang.Character.isLetterOrDigit(c)) {&#xA;&#x9;&#x9;&#x9;setStyleSelector(this.style, &quot;background&quot;, &quot;invalid&quot;);&#xA;&#x9;&#x9;&#x9;this.toolTip = &quot;Use only digits and letters for user name&quot;;&#xA;&#x9;&#x9;&#x9;return;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;i++;&#xA;&#x9;}&#xA;&#x9;setStyleSelector(this.style, &quot;background&quot;, &quot;white&quot;, &quot;User name&quot;);&#xA;&#x9;this.toolTip = null;&#xA;}&#xA;&#xA;function setStyleSelector(style, property, selector) {&#xA;&#x9;var it = style.styleSelectors.iterator();&#xA;&#x9;while (it.hasNext()) {&#xA;&#x9;&#x9;var styleSelector = it.next();&#xA;&#x9;&#x9;if (styleSelector.property == property) {&#xA;&#x9;&#x9;&#x9;styleSelector.selector = selector;&#xA;&#x9;&#x9;&#x9;return;&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;}" toolTip="Use only digits and letters for user name" text="&lt;your user name goes here>">
    <style>
      <styleSelectors property="background" selector="invalid"/>
    </style>
  </controls>
  <controls xsi:type="tm.widgets:Label" href="passwordLabel.tm#/"/>
  <controls xsi:type="tm.widgets:PasswordField" name="passwordText" text="password">
    <style>
      <styleSelectors property="background" selector="white"/>
    </style>
  </controls>
  <controls xsi:type="tm.widgets:PushButton" name="loginButton" text="Login">
    <style>
      <styleSelectors property="foreground" selector="red"/>
    </style>
  </controls>
  <controls xsi:type="tm.widgets:PushButton" name="cancelButton" text="Cancel">
    <style>
      <styleSelectors property="foreground" selector="red"/>
    </style>
  </controls>
  <layout xsi:type="swt.layouts:GridLayout" numColumns="2"/>
</tm.widgets:Composite>
