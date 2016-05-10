package studyEclipsepackage;

public class ArmstrongNum {
	
public	int num = 1534;
	public String str = String.valueOf(num);;
	int len = str.length();
	
	public static void main(String[] args) 
	
	{
		ArmstrongNum obj = new ArmstrongNum();
		 double sum = 0;
		 int len1 = obj.len;
		 int newsum = 0;
		
		int loc = obj.num;
		System.out.println(len1);
		System.out.println("loc = " + loc);
		 while (loc!=0)
		{
			
			int i = loc % 10;
			System.out.println(i);
			sum = sum + Math.pow(i, len1);
			
			 System.out.println("sum = " + sum);

			loc = loc/10;
		
		}	
		 
		 newsum = (int) sum;
		 System.out.println("newsum = " + newsum);
		if (newsum == obj.num)
		{
			System.out.println(obj.num +" is an Armstrong number");
		}
		else
		{
			System.out.println(obj.num+" is not an Armstrong number");
		}
		

	}

}
