package studyEclipsepackage;

public class LargestNum {

	static void findLarge(int[] arr)
	{
		int temp = 0;
	
		 for (int i = 0;i<=arr.length;i++)
		 {
			 for (int j=1;j<arr.length;j++)
			 {
				 if (arr[j-1]>arr[j])
				 {
					 temp = arr[j-1];
					 arr[j-1] = arr[j];
					 arr[j] = temp;
				 }
			 }
		 }
		
	}

	
	public static void main(String[] args) {
		int[] arr = {1234,4,8,-2,90,56,367,45};
		
		findLarge(arr);
		 System.out.println("Largest num is: " + arr[arr.length-1]);
		 System.out.println("Smallest num is: " + arr[0]);
		 
		 
//!--Sorted array
		 System.out.print("The Sorted Array is: ");
			for (int i=0;i<=arr.length-1;i++)
			{
				System.out.println(arr[i]);
				
			}
		 

	}

}
