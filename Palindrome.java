import java.util.Stack;

public class App{
	public static void main (String[] args){
		printResult("ADA");
		printResult("ABCD");
        printResult("RENNER");
        printResult("socorram me subi no on ibus em marrocos");
	}
	public static void printResult(String word){
		System.out.println(word + " is an palindrome?" + palindromeTest(word));
	}
	
	public static boolean palindromeTest(String word){
		
		Stack stack = new Stack();

		for (int i = 0; i<word.length(); i++){
		stack.push(word.charAt(i));
		}
		String inverseWord = "";
		while(!stack.empty()){
			inverseWord += stack.pop();
		}
		if (inverseWord.equalsIgnoreCase(word))
		{
			return true;
		}		
		return false;
	}
}
