package studyEclipsepackage;

public class PatternPrint {
	
	static int rows = 5;

	public static void main(String[] args) {
		
		for (int i=1;i<=rows;i++)
		{
			int j = 1;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}
			System.out.println(" ");
		}
		
	}

}
