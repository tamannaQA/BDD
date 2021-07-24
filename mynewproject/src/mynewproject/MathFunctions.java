package mynewproject;

public class MathFunctions {
	
	private int Addition(int x, int y)
	{
		int z;
		z=x+y;
		return z;
	}
	
	private int Square(int x)
	{
		return x*x;
	}
	
	private String stringConcate(String str1, String str2)
	{

		   String combinedString = str1.concat(str2);//concate method to combine the two strings
		
		   return combinedString;//return the combined string
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x=9.78;
		double y=10.5;
		
		Integer i=10;
		Integer j=11;
		
		System.out.println("" + Math.ceil(x));
		System.out.println("" + Math.floor(x));
		System.out.println("" + i.equals(j));
		System.out.println("" +i.compareTo(j));

		
	}

}
