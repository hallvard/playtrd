package no.hal.scxml.javascript;

import org.apache.commons.scxml.model.Transition;
import org.apache.commons.scxml.model.TransitionTarget;

public class Test1 extends JavascriptTest {

	private int loopEntryCount = 0;
	
	public void test1() {
		go();
		assertEquals(5, loopEntryCount);
	}

	public void onEntry(TransitionTarget target) {
		if ("loop".equals(target.getId())) {
			loopEntryCount++;
		}
	}
	public void onExit(TransitionTarget source) {
//		System.out.println(source.getId() + " ->");
	}
	public void onTransition(TransitionTarget source, TransitionTarget target, Transition transition) {
//		System.out.println(source.getId() + " -> " + target.getId());
	}
}
