package studyEclipsepackage;

public class CheckPrime {
	int num = 13;
	
	public int isPrime(int num)
	{
		int j = 0;
		for (int i =1; i<=num/2;i++)
		{
		j = num%i;
		
		}
		if (j!=0)
		{	
				
		return 1;
		}
		else
		{
			return 0;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckPrime obj = new CheckPrime();
		int result = obj.isPrime(obj.num);
		if (result == 1)
			System.out.println(obj.num + " is prime");
		else
			System.out.println(obj.num + " not prime");

	}

}
