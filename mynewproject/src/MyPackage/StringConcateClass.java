package MyPackage;

public class StringConcateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Hello World";
		
		int strLength;
		
		
		StringConcateClass strCls = new StringConcateClass();
		
		strLength = strCls.stringLength(str1);
		
		System.out.println("string length: " + strLength);
	}

	private String stringConcate(String str1, String str2)
	{

		   String combinedString = str1.concat(str2);//concate method to combine the two strings
		
		   return combinedString;//return the combined string
	}
	
	private int stringLength(String str1)
	{

		   int lengthString = str1.length();
		
		   return lengthString;//return the length string
	}
}
