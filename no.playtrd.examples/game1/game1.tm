<?xml version="1.0" encoding="ASCII"?>
<tm.widgets:TabFolder xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:tm.widgets="platform:/plugin/org.eclipse.e4.tm/model/tm/widgets.ecore" scriptSource="function init() {&#xA;&#x9;this.$nameLabel.text = &quot;No package&quot;;&#xA;&#x9;loadEPackage(&quot;http://playtrd.no/v10/playtrd.ecore&quot;, &quot;platform:/plugin/no.playtrd/model/playtrd.ecore&quot;);&#xA;&#x9;supportNotifications(this);&#xA;&#x9;var filter = function(res) { return res.URI.fileExtension() == &quot;xmi&quot;;};&#xA;&#x9;var resources = this.eResource().resourceSet.resources.collect(filter);&#xA;&#x9;var uod = resources.findInstance($playtrd.$UoD);&#xA;&#x9;this.$nameLabel.text = &quot;No UoD&quot;;&#xA;&#x9;if (uod != undefined) {&#xA;&#x9;&#x9;supportNotifications(uod);&#xA;&#x9;} else {&#xA;&#x9;&#x9;java.lang.System.out.println(&quot;No UoD in &quot; + resources);&#xA;&#x9;}&#xA;&#x9;this.$nameLabel.text = &quot;No Game&quot;;&#xA;&#x9;var games = uod._().findInstances($playtrd.$Game);&#xA;&#x9;this.dataObject = (games.size() > 0 ? games[0] : null);&#xA;}&#xA;&#xA;function onSetDataObject(notification) {&#xA;&#x9;var game = this.dataObject;&#xA;&#x9;this.$gameTab.$gameComposite.dataObject = game;&#xA;&#x9;if (game != null) {&#xA;&#x9;&#x9;adaptTo(game);&#xA;&#x9;}&#xA;}&#xA;&#xA;function onChangePlayers(notification) {&#xA;&#x9;&#xA;}" selectionIndex="0">
  <controls xsi:type="tm.widgets:Tab" name="gameTab" text="Game">
    <controls xsi:type="tm.widgets:Composite" scriptSource="function onSetDataObject(notification) {&#xA;&#x9;var game = this.dataObject;&#xA;&#x9;this.$playerList.dataObject = (game != null ? game.players : null);&#xA;&#x9;this.$poiList.dataObject = (game != null ? game.pois : null);&#xA;}" name="gameComposite">
      <controls xsi:type="tm.widgets:SingleSelectionList" scriptSource="function onSetDataObject(notification) {&#xA;&#x9;this.update();&#xA;}&#xA;&#xA;function update() {&#xA;&#x9;this.items.clear();&#xA;&#x9;var players = this.dataObject;&#xA;&#x9;if (players instanceof java.util.List) {&#xA;&#x9;&#x9;this.items.addAll(players.mapProperty('name'));&#xA;&#x9;}&#xA;&#x9;this.selectionIndex = 0;&#xA;}" name="playerList" selectionIndex="0">
        <selectionIndices>0</selectionIndices>
        <items>hong</items>
        <items>meng</items>
        <items>hal</items>
        <items>bian</items>
        <items>alfinge</items>
      </controls>
      <controls xsi:type="tm.widgets:SingleSelectionList" scriptSource="function onSetDataObject(notification) {&#xA;&#x9;this.update();&#xA;}&#xA;&#xA;function update() {&#xA;&#x9;this.items.clear();&#xA;&#x9;var pois = this.dataObject;&#xA;&#x9;if (pois instanceof java.util.List) {&#xA;&#x9;&#x9;this.items.addAll(pois.mapProperty('name'));&#xA;&#x9;}&#xA;&#x9;this.selectionIndex = 0;&#xA;}" name="poiList">
        <items>POI 1</items>
        <items>POI 2</items>
        <items>POI 3</items>
        <items>POI 4</items>
        <items>POI 5</items>
        <items>POI 6</items>
      </controls>
    </controls>
  </controls>
  <controls xsi:type="tm.widgets:Tab" name="playerUIPrototype" text="Player UI prototype">
    <controls xsi:type="tm.widgets:Composite" name="playerUIPrototypeComposite">
      <controls xsi:type="tm.widgets:SingleSelectionList">
        <items>Passing 1</items>
        <items>Passing 2</items>
        <items>Passing 3</items>
        <items>POI 4</items>
        <items>POI 5</items>
        <items>POI 6</items>
      </controls>
    </controls>
  </controls>
</tm.widgets:TabFolder>
