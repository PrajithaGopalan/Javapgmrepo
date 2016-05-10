package studyEclipsepackage;
import java.util.Scanner;


public class CommandLineInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Name Please: ");
		String username = scanner.next();
		
		System.out.print("what: ");
		String what = scanner.next();
		
		System.out.println(username + what);
		

	}

}
