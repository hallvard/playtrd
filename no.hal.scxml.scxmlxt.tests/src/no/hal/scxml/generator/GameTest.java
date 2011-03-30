package no.hal.scxml.generator;

import org.eclipse.emf.ecore.EObject;

public class GameTest extends ScxmlTestCase {

	@Override
	protected void setUp() throws Exception {
		setUp("Game1.xmi");
	}
	
	public void testGame1() {
		startScxml();
		EObject game = getEObject(getState("QuestionGame.active"));
		EObject level1 = getEObject(getState("QuestionGame.level1"));
		EObject level2 = getEObject(getState("QuestionGame.level2"));
		assertNotNull(game);
		assertNotNull(level1);
		assertNotNull(level2);
		EObject gui = (EObject)eGet(game, "gui");
		assertNotNull(gui);

		// check SCXML state
		assertInState("QuestionGame.active QuestionGame.level1.ask QuestionGame.level2.idle");
		// check GUI state
		assertEquals(eGet(gui, "question"), eGet(level1, "question"));
		String feedback = (String)eGet(gui, "feedback");
		assertTrue(feedback == null || "".equals(feedback));
		
		// provide a wrong answer
		eSet(gui, "answer", "Kluff!");
		resumeScxml();
		// check SCXML state (same states)
		assertInState("QuestionGame.active QuestionGame.level1.ask QuestionGame.level2.idle");
		// check GUI state
		assertEquals(eGet(gui, "question"), eGet(level1, "question"));
		feedback = (String)eGet(gui, "feedback");
		assertTrue(feedback != null && feedback.contains("rong"));

		// provide a correct answer for level1
		eSet(gui, "answer", eGet(level1, "answer"));
		resumeScxml();
		// check SCXML state (same states)
		assertInState("QuestionGame.active QuestionGame.level1.correct QuestionGame.level2.ask");
		// check GUI state
		assertEquals(eGet(gui, "question"), eGet(level2, "question"));
		feedback = (String)eGet(gui, "feedback");
		assertTrue(feedback == null || "".equals(feedback));
		
		// provide a correct answer for level2
		eSet(gui, "answer", eGet(level2, "answer"));
		resumeScxml();
		// check SCXML state (same states)
		assertInState("QuestionGame.finished QuestionGame.level1.correct QuestionGame.level2.correct");
		// check GUI state
		assertEquals(eGet(gui, "question"), null);
		feedback = (String)eGet(gui, "feedback");
		assertTrue(feedback != null && feedback.contains("inished"));
	}
}
