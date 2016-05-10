package studyEclipsepackage;

public class Palindrome {

	public static void main(String[] args) {
		
		String str = "hindi";
		char[] arr= str.toCharArray();
		String str1 = "";
		
		for(int i=arr.length-1;i>=0;i--)
		{
			str1 = str1 + arr[i];
		}
		
		if (str.equals(str1))
		{
			System.out.print(str1 + " Is a palindrome");
		}
		else
			System.out.print(str + " Is not a palindrome");
	}

}
