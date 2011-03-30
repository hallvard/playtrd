<?xml version="1.0" encoding="ASCII"?>
<tm.widgets:TabFolder xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:swt.layouts="http://www.eclipse.org/e4/swt/layouts.ecore" xmlns:tm.widgets="http://www.eclipse.org/e4/tm/widgets.ecore" name="aTabFolder" selectionIndex="3">
  <controls xsi:type="tm.widgets:Tab" name="tab1" text="Simple">
    <controls xsi:type="tm.widgets:Label" name="aLabel" text="A label"/>
    <controls xsi:type="tm.widgets:Text" name="aText" text="A text field"/>
    <controls xsi:type="tm.widgets:PushButton" name="aPushButton" text="A push button"/>
    <controls xsi:type="tm.widgets:ToggleButton" name="aToggleButton" text="A toggle button"/>
    <controls xsi:type="tm.widgets:CheckBox" name="aCheckBox" text="A check box"/>
    <layout xsi:type="swt.layouts:GridLayout" numColumns="2"/>
  </controls>
  <controls xsi:type="tm.widgets:Tab" name="tab2" text="Complex">
    <controls xsi:type="tm.widgets:Label" text="ComboBox:"/>
    <controls xsi:type="tm.widgets:ComboBox" name="aComboBox">
      <items>Item 1</items>
      <items>Item 2</items>
      <items>Item 3</items>
    </controls>
    <controls xsi:type="tm.widgets:Label" text="Single selection list:"/>
    <controls xsi:type="tm.widgets:SingleSelectionList" name="aSingleSelectionList" selectionIndex="2">
      <items>Item 1</items>
      <items>Item 2</items>
      <items>Item 3</items>
      <selectionIndices>2</selectionIndices>
    </controls>
    <controls xsi:type="tm.widgets:Label" text="Multiple selection list:"/>
    <controls xsi:type="tm.widgets:MultipleSelectionList" name="aMultipleSelectionList" selectionIndex="0">
      <items>Item 1</items>
      <items>Item 2</items>
      <items>Item 3</items>
      <selectionIndices>0</selectionIndices>
      <selectionIndices>1</selectionIndices>
    </controls>
    <controls xsi:type="tm.widgets:Label" text="Browser:"/>
    <controls xsi:type="tm.widgets:Browser" name="aBrowser" text="&lt;b>A browser&lt;/b>"/>
    <layout xsi:type="swt.layouts:GridLayout" numColumns="2" verticalSpacing="10"/>
  </controls>
  <controls xsi:type="tm.widgets:Tab" name="tab3" text="Composite">
    <controls xsi:type="tm.widgets:Composite">
      <controls xsi:type="tm.widgets:Label" text="A label inside a composite"/>
    </controls>
    <controls xsi:type="tm.widgets:GroupBox" name="aGroupBox" text="A group">
      <controls xsi:type="tm.widgets:Label" text="A label inside a group"/>
    </controls>
    <controls xsi:type="tm.widgets:TabFolder" selectionIndex="1">
      <controls xsi:type="tm.widgets:Tab" text="Tab 1">
        <controls xsi:type="tm.widgets:Label" text="A label inside tab 1"/>
      </controls>
      <controls xsi:type="tm.widgets:Tab" text="Tab 2">
        <controls xsi:type="tm.widgets:Label" text="A label inside tab 2"/>
      </controls>
      <controls xsi:type="tm.widgets:Tab" text="Tab 3">
        <controls xsi:type="tm.widgets:Label" text="A label inside tab 3"/>
      </controls>
    </controls>
    <layout xsi:type="swt.layouts:GridLayout" verticalSpacing="10"/>
  </controls>
  <controls xsi:type="tm.widgets:Tab" name="tab4" text="Layouts">
    <controls xsi:type="tm.widgets:GroupBox" name="fillLayoutGroup" text="Fill layout">
      <controls xsi:type="tm.widgets:Label" text="Label 1"/>
      <controls xsi:type="tm.widgets:Label" text="Label 2"/>
      <controls xsi:type="tm.widgets:Label" text="Label 3"/>
      <layout xsi:type="swt.layouts:FillLayout"/>
    </controls>
    <controls xsi:type="tm.widgets:GroupBox" name="rowLayoutGroup" text="Row layout">
      <controls xsi:type="tm.widgets:Label" text="Label 1">
        <layoutData xsi:type="swt.layouts:RowLayoutData"/>
      </controls>
      <controls xsi:type="tm.widgets:Label" text="Label 2">
        <layoutData xsi:type="swt.layouts:RowLayoutData" width="200" height="80"/>
      </controls>
      <controls xsi:type="tm.widgets:Label" text="Label 3">
        <layoutData xsi:type="swt.layouts:RowLayoutData"/>
      </controls>
      <layout xsi:type="swt.layouts:RowLayout"/>
    </controls>
    <controls xsi:type="tm.widgets:GroupBox" name="gridLayoutGroup" text="Grid layout">
      <controls xsi:type="tm.widgets:Label" text="Label 1"/>
      <controls xsi:type="tm.widgets:Label" text="Label 2"/>
      <controls xsi:type="tm.widgets:Label" text="Label 3">
        <layoutData xsi:type="swt.layouts:GridLayoutData" horizontalSpan="2"/>
      </controls>
      <layout xsi:type="swt.layouts:GridLayout" numColumns="2"/>
    </controls>
    <controls xsi:type="tm.widgets:GroupBox" name="formLayoutGroup" text="Form layout">
      <controls xsi:type="tm.widgets:Label" name="formLayoutGroupLabel1" text="Label 1"/>
      <controls xsi:type="tm.widgets:Label" name="formLayoutGroupLabel2" text="Label 2">
        <layoutData xsi:type="swt.layouts:FormLayoutData">
          <left numerator="100" denominator="100" offset="-10" control="//@controls.3/@controls.3/@controls.0"/>
          <top numerator="100" denominator="100" offset="10" control="//@controls.3/@controls.3/@controls.0"/>
        </layoutData>
      </controls>
      <controls xsi:type="tm.widgets:Label" name="formLayoutGroupLabel3" text="Label 3">
        <layoutData xsi:type="swt.layouts:FormLayoutData">
          <left numerator="50" denominator="100" offset="-10" control="//@controls.3/@controls.3/@controls.1"/>
        </layoutData>
      </controls>
      <layout xsi:type="swt.layouts:FormLayout"/>
    </controls>
    <layout xsi:type="swt.layouts:GridLayout" numColumns="2"/>
  </controls>
</tm.widgets:TabFolder>
