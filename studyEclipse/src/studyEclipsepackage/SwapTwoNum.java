package studyEclipsepackage;

public class SwapTwoNum {
 int num1 = 0;
 int num2 = 0;
 int num3 = 0;
 public void initialize()
 {
	 num1 = 56;
	 num2 = 98;
 }

 public void method1()
 {
	 num3 = num1;
	 num1 = num2;
	 num2 = num3;
	 System.out.println("method1   " + "1st number" + num1  +"   2nd number" + num2); 
	 
}
 
 public void method2()
 {
	num1 = num1 + num2;
	num2 = num1 - num2;
	num1 = num1 - num2;
	
	System.out.println("method2   " + "1st number" + num1  +"   2nd number" + num2);  
	 
	 
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapTwoNum obj = new SwapTwoNum();
		obj.initialize();
		System.out.println("org numbers   " + "1st number" + obj.num1  +"   2nd number" + obj.num2); 
		obj.method1();
		obj.initialize();
		obj.method2();	
		
	}

}
