function collectTokens(tokens, sep, start, end) {
	var s = "";
	if (start < 0) {
		start = tokens.length + start;
	}
	if (end < 0) {
		end = tokens.length + end;
	}
	for (i = start; i <= end; i++) {
		if (i > start) {
			s = sep + s;
		}
		if (tokens[i].length() > 0) {
			s = s + tokens[i];
		}
	}
	return s;
}

function getNames(s, start, end) {
	var pos = s.indexOf(",");
	if (pos >= 0) {
		s = s.substring(pos + 1, s.length()) + " " + s.substring(0, pos);
	}
	return collectTokens(s.split(" "), " ", start, end);
}
