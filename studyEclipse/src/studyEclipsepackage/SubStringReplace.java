package studyEclipsepackage;

public class SubStringReplace {

	public static void main(String[] args) {
		
		String str = "This is good and this is bad";
		String substr = "was";
		System.out.println("Org String : " + str);
		String str1 = str.replace("is", substr);
		
		System.out.println("New String : " + str1);
		

	}

}
