package studyEclipsepackage;

public class Fibonacci {
	
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 1;
		 int count = 7;
			int curr = 0;
			 int prev = 0;
			int num = 0;
		while (value <= count)
		{
			num = curr + prev;
			System.out.print(num);	
				value++;
				if (value == 2)
				{
					prev = num;
					curr = 1;
				}
						prev = curr;
						curr = num;
					
				
			
			
			
		}

	}

}
