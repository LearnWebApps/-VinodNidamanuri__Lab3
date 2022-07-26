package question1;

import java.util.Stack;

public class BalancingBrackets 
{
	static boolean findBalance(String input){
		boolean rtnValue = false;
		
		if(input.length() %2 != 0)
			return rtnValue;
		
		Stack<Character> brakets = new Stack<>();
		
		for(int index=0; index < input.length(); index++) {
			char readChar = input.charAt(index);
			
			if(readChar == '{' || readChar == '[' || readChar == '(') {
				brakets.push(readChar);
				continue;
			}
			
			if(brakets.isEmpty()){
				rtnValue = false;
				break;
			}
			if(readChar == '}') {
				char popChar = brakets.pop();
				if(popChar == '{')
					rtnValue = true;
				else {
					rtnValue= false;
					break;
				}
			}
			
			if(readChar == ']') {
				char popChar = brakets.pop();
				if(popChar == '[')
					rtnValue = true;
				else {
					rtnValue= false;
					break;
				}
			}
			
			if(readChar == ')') {
				char popChar = brakets.pop();
				if(popChar == '(')
					rtnValue = true;
				else {
					rtnValue= false;
					break;
				}
			}
		}
		return rtnValue;
	}
	public static void main(String[] args) 
	{
		String braces = "( [ [ { } ] ] )";
		//String braces = "( [ [ { } ] ] ) )";
		
		//System.out.println("length of braces before - "+ braces.length());
		
		braces = braces.replaceAll("\\s", "");
		//System.out.println("length of braces before - "+ braces.length());
		//System.out.println("spaces removed - "+ braces);
		
		if(findBalance(braces)) {
			System.out.println("The entered String has Balanced Brackets");
		}
		else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}

	}

}
