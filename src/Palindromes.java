import java.util.Stack;

public class Palindromes {
public static void main(String[] args) {
	
}

boolean isPalindrome(String s) {

	Stack<Character> stack = new Stack<Character>();
	for (int i = 0; i < s.length(); i++) {
	char c = s.charAt(i);
	stack.add(c);
	}
	char d;
	String str = "";
	for(int j = 0; j<stack.size(); j++) {
	d = stack.pop();
	str = str + d;
	}
	if(str.equalsIgnoreCase(s)) {
		return true;
	}
	else {
	return false;
}}
}
