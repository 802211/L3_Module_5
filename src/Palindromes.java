import java.util.Stack;

public class Palindromes {
	public static void main(String[] args) {

	}

	boolean isPalindrome(String s) {
		String newString = "";
		
		for (int j = 0; j < s.length(); j++) {
			
		if(s.charAt(j) == ' ' || s.charAt(j) == '!' || s.charAt(j) == ',' ) {
			
		}
		else {
			newString = newString + s.charAt(j);
		}
		}
	newString = newString.toLowerCase();
		for (int i = 0; i < newString.length()/2; i++) {
			char start = newString.charAt(i);
			char end = newString.charAt(newString.length() - 1 - i);
			if(start !=end) {
				return false;
			}		
		}
return true;
	}
	}













/*Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ' ') {

			} else {
				stack.add(c);
			}
		}
		char d;
		String str = "";
		for (int j = 0; j < stack.size(); j++) {
			d = stack.pop();
			str = str + d;
		}
		System.out.println(str);
		System.out.println(s);
		if (str.equalsIgnoreCase(s)) {
			return true;
		} else {
			return false;
		}*/