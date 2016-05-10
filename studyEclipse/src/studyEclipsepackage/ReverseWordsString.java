package studyEclipsepackage;

public class ReverseWordsString {
	
	public static void main(String[] args) {
		String newstr = "";
		String str = "Mili is good girl and a good singer";
		 String[] arr = str.split(" ");
		 for(int i=arr.length-1;i>=0;i--)
		 {
			newstr = newstr + " " + arr[i];
		 }
		 
		 System.out.print("the new string is : " + newstr);
		 
//To print the hashCode of a String		 
		 System.out.println("The hashcode vaue is : " + str.hashCode());

	}

}
