package studyEclipsepackage;

public class AddNumToWords {

	public static void main(String[] args) {
	
String str = "this is good";

String newstr = "";

int k = 0;
String[] words = str.split("\\W+");
// Print the original string
System.out.println("Org String is : " + str);

for(int i=0;i<=words.length-1;i++)
{
	k =i+1;
	newstr = newstr + " " + words[i] + k;  	
}
System.out.print("The new String is : ");
System.out.print(newstr);

	}

}
