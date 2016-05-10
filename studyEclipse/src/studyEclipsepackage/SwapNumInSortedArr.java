package studyEclipsepackage;

public class SwapNumInSortedArr {
	
	public static int[] arr = {1,2,3,5,6,4};
	public static int num1 = 0;
	public static int expected = 0;
	public static int num2 = 0;

	public static void main(String[] args) {
		
		int index1 = 0;
		int index2 = 0;
		int value1 = 0;
		int value2 = 0;
		for (int i=0;i<arr.length;i++)
		{
			num1 = arr[i] ;
		    num2 = arr[i+1];
		    expected = arr[i] + 1;
		    if (num2 != expected)
		    {
		    	index1 = i+1;
		    	value1 = expected;
		    	value2 = num2;
		    	 break;
		    }    
		    
		}  
		
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i] == expected)
			{
				index2 = i;
				break;
			}
		}
		
		arr[index1] = value1;
		arr[index2] = value2;
		
		for (int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
		
		
		
		

	}

}
