package studyEclipsepackage;

public class FindMissingNumInArray {
	
	public static void findMissingNum(int[] arr)
	{
		int curr = 0;
		int prev = 0;
		int expected = 0;
		for (int i=0;i<=arr.length-2;i++)
		{
			prev = arr[i];
			curr = arr[i+1];
			expected = prev +1;
			
			if (expected != curr)
			{
				System.out.print("The Missing Num is: " + expected);
				break;
			}			
			
		}
	}

	public static void main(String[] args)
	{
	int[] arr = {1,2,4,5} ;
	
	findMissingNum(arr);
		
	}

}