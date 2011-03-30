function currentLevelFinished() {
	this.finishedLevels.add(this.currentLevel);
	var nextLevelNum = this.finishedLevels.size();
	this.currentLevel = (this.levels.size() > nextLevelNum ? this.levels[nextLevelNum] : null);
}
