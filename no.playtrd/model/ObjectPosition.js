function onSetGlobePosition(notification) {
	var objectPosition = notification.notifier;
	java.lang.System.out.println(objectPosition + " moved to " + objectPosition.globePosition);
//	var uod = notification.notifier;
//	while (uod != null) {
//		if (uod.isA(playtrd.UoD)) {
//			break;
//		}
//	}
//	if (uod == null) {
//		return;
//	}
//	var games = uod.games.iterator;
//	while (games.hasNext())Ê{
//		var game = games.next();
//		if (game.running) {
//			game.onPositionedMoved(notification);
//		}
//	}
}