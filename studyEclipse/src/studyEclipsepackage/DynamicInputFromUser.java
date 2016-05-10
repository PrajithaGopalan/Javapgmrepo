package studyEclipsepackage;

import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DynamicInputFromUser {
	public static int sum;
	public static int difference;
	public static int multiply;
	public static double divide;
//Using Scanner	
	public static int UsingScanner()
	{
		System.out.println("Using Scanner Class");
		System.out.print("Enter 1st number for adition: ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.print("Enter 2nd number for addition: ");
		int j = sc.nextInt();
		return sum = i+j;
	}
	
//Using BufferedReader	/InputStreamReader
	public static int UsingBufferedReader() throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Using BufferedReader/InputStreamReader Class");
		System.out.print("Enter 1st Number for subtraction :");
       int num1 = Integer.parseInt(br.readLine());
        System.out.print("Enter 2nd Number for subtraction:");
        int num2 = Integer.parseInt(br.readLine());
		return difference = num1 -num2;
	}
//Using DataInputStream
	@SuppressWarnings("deprecation")
	public static int UsingDataInputStream() throws IOException
	{
		DataInputStream dis= new DataInputStream(System.in);
		System.out.println("Using DataInputStream Class");
		System.out.print("Enter 1st Number to multiply :");
		String str1 = dis.readLine();
		int a = Integer.parseInt(str1);
		System.out.print("Enter 2nd Number to multiply :");
		String str2 = dis.readLine();
		int b = Integer.parseInt(str2);
		return multiply = a*b;
	}
	
//Using console
	public static double UsingConsole()
	{
		Console con = System.console();
		if (con!=null)
		{
		System.out.println("Using Console Class");
		System.out.print("Enter 1st Number to divide :");
		
		String s=con.readLine();
		int x = Integer.parseInt(s);
		System.out.print("Enter 2nd non-zero Number to divide :");
		String ss = con.readLine();
		int y = Integer.parseInt(ss);
		
		if (y!= 0)
		{
		 divide = x/y;
		}
		else
			 divide = 0;
		}
		else
			System.out.println("Unable to fetch console");
		return divide;
	}			
	
	public static void main(String[] args) throws NumberFormatException, IOException {
//Using Scanner		 
		sum = UsingScanner();
		 System.out.println("Sum = " + sum);
		
//BufferedReader/InputStreamReader
		 difference = UsingBufferedReader();
		 System.out.println("Difference = " + difference);
		 
//DataInputStream
		 multiply = UsingDataInputStream();
		 System.out.println("Multiply = " + multiply);
		 
//Using console
		 divide = UsingConsole();
		// if (divide!=0)
		// System.out.println("Division = " + divide);
		// else
		//	 System.out.println("Division not possible ");
	}

}
