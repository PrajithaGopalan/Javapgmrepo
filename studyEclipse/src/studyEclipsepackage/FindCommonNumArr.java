package studyEclipsepackage;

public class FindCommonNumArr {
	static int[] arr1 = {2,45,76,-2,98,-65};
	static int[] arr2 = {67,2,500,-2,88,-65};
static int search = 45;
	public static void main(String[] args) {
	
		for (int i=0;i<=arr1.length-1;i++)
		{
			
		
			for (int j=0;j<=arr2.length-1;j++)
			{
				if (arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
				}
			}
			
			
		}
//Linear Search		
		for (int i=0;i<=arr1.length-1;i++)
		{
		
		if(search == arr1[i])
		{
			System.out.println("found element");
		}
		}
		
		
	
	}

}
