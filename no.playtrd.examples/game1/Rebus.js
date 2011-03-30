function onPositionedMoved(notification) {
	var objectPosition = notification.notifier;
	java.lang.system.out.println(objectPosition.positioned + " moved to " + objectPosition.globePosition);
}
