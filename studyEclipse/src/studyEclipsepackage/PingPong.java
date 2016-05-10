package studyEclipsepackage;

public class PingPong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 101;
		if (num%3 == 0) 
		{
			if (num%5 ==0)
			{
				System.out.println("PingPong-div by 3 and 5");
				
			}
			else
			{
				System.out.println("Ping- div by 3");
			}
			
		}
		else
		{
			if (num%5 == 0)
			{
				System.out.println("Pong- div by 5");
			}
			else
			{
			System.out.println(num);
			}
		}
		
			
	
		

	}

}
