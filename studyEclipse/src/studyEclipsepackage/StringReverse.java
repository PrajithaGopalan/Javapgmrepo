package studyEclipsepackage;



public class StringReverse {
	public static void main(String[] args) {
	
	String str = "Mili is a good girl";
	
	char[] newarr= str.toCharArray();
			
			for(int i=newarr.length-1;i>=0;i--)
			{
				System.out.print(newarr[i]);
			}
			
	}

}
