package studyEclipsepackage;

import java.util.Stack;

public class MatchingParenthesis {
	
	public static boolean IsMatchingParenthesis(String str)
	{
		if (str.charAt(0)=='{')
			return false;
		Stack<Character> stk = new Stack<Character>();
		char c;
		
		for(int i=0;i<str.length();i++)
		{
			c = str.charAt(i);
			if (c=='(')
				stk.push(c);
			else if (c=='{')
			  stk.push(c);
			else if (c==')')
				if (stk.empty())
					return false;
				else if (stk.peek() == '(')
					stk.pop();
				else
					return false;
			else if (c=='}')
				if (stk.empty())
					return false;
				else if (stk.peek() == '{')
					stk.pop();
				else
					return false;				
		}
		return stk.empty();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "({)}}}";
		
 boolean result = IsMatchingParenthesis(str);
 
 if (result == true)
	 
	 System.out.print(str +" Matching");
 
 else
	 System.out.print(str + " Not Matching");
	}

}
