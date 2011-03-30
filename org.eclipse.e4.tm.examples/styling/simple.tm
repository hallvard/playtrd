<?xml version="1.0" encoding="ASCII"?>
<tm.widgets:Composite xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:tm.layouts="http://www.eclipse.org/e4/tm/layouts.ecore" xmlns:tm.styles="http://www.eclipse.org/e4/tm/styles.ecore" xmlns:tm.widgets="http://www.eclipse.org/e4/tm/widgets.ecore" name="aComposite">
  <style>
    <styleItems xsi:type="tm.styles:ColorItem" name="white" source="white"/>
    <styleItems xsi:type="tm.styles:ColorItem" name="red" source="#ff0000"/>
  </style>
  <controls xsi:type="tm.widgets:Label" name="aLabel" text="A label">
    <style>
      <styleItems xsi:type="tm.styles:ImageItem" name="labelImage" source="platform:/plugin/org.eclipse.e4.tm.builder.tests/resources/Label.gif"/>
      <styleSelectors property="background" selector="white"/>
      <styleSelectors property="image" selector="labelImage"/>
    </style>
  </controls>
  <controls xsi:type="tm.widgets:Text" name="aText" text="A text field">
    <layoutData xsi:type="tm.layouts:RectangleLayoutData" x="100" y="10"/>
  </controls>
  <controls xsi:type="tm.widgets:PushButton" name="aPushButton" text="A push button">
    <style>
      <styleSelectors property="foreground" selector="red"/>
    </style>
    <layoutData xsi:type="tm.layouts:RectangleLayoutData" y="40"/>
  </controls>
  <controls xsi:type="tm.widgets:ToggleButton" name="aToggleButton" text="A toggle button">
    <layoutData xsi:type="tm.layouts:RectangleLayoutData" x="150" y="40"/>
  </controls>
  <layout xsi:type="tm.layouts:RectangleLayout">
    <defaultLayoutData width="20" height="40"/>
  </layout>
</tm.widgets:Composite>
