package studyEclipsepackage;

public class MergeTwoArr {
	
	public static int[] arr1 = {1,2,3,4,5};
	public static int[] arr2 = {6,7,8,9,10};
	public static int[] fin = new int[arr1.length + arr2.length];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<arr1.length;i++)
		{
			fin[i]= arr1[i];
			
		}
		
		int j = arr1.length;
		for(int i=0;i<arr2.length;i++)
		{
			fin[j] = arr2[i];
			j++;
			
		}
		
		for (int i=0;i<fin.length;i++)
		{
			System.out.print(" " + fin[i]);
		}

	}

}
