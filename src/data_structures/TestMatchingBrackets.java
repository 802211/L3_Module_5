package data_structures;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	Stack<Character> s = new Stack<Character>();

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS
	// A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		
		for (int i = 0; i < b.length(); i++) {
		if(b.charAt(i) == '{') {
			s.push(b.charAt(i));
		}
		else if(b.charAt(i) == '}') {
			if(s.isEmpty() == true) {
				return false;
			}
			else {
				s.pop();
			}
		}
	
		}

		if(s.isEmpty() == true) {
			return true;
		}
		else {
			return false;
		}
	}

}