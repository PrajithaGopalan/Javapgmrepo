package studyEclipsepackage;

public class Factorial {
	
	int num = 5;
	int fact = 1;
	int recur = 0;
	public void method1()
	{
		if ((num == 1) || (num ==0))
		{fact = 1;}
		else{
		for(int i=1;i<=num;i++)
		{
			fact = fact * i;
			
		}
		}
			
	}
public int method2(int num)
{
	if ((num == 1) || (num ==0))
	{
		recur = 1;
	}
	else
	{		recur = method2(num-1) * num;
	}
   return recur;
}
	public static void main(String[] args) {
		
		Factorial obj =  new Factorial();
		System.out.println("org num " + obj.num);
		obj.method1();
		System.out.println(obj.fact);
		System.out.println("Recursion");
		int no = obj.num;
		obj.recur = obj.method2(no);
		System.out.println(obj.recur);
		// TODO Auto-generated method stub
		

	}

}
