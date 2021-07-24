package MyPackage;

public class MathFunctions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mult=0;
		int max =0;
		int min=0;
		int x=5;
		int y=15;
		
		
		MathFunctions2 mthfn2 = new MathFunctions2();
		
		mult = mthfn2.multiplication(5, 15);
		max = mthfn2.getMax(5, 15);
		
		min = mthfn2.getMin(5, 15);
		
		System.out.println("The product of " + x + " and " + y + " is " + mult);
		System.out.println(max + " is the greatest number of " + x + " and " + y);
		
		System.out.println(min + " is the smallest number of " + x + " and " + y);	

	}

	private int multiplication(int x, int y)
	{
		int myValue= x*y;
		return myValue;
	}
	
	private int getMax(int x, int y)
	{
		int myValue=  Math.max(x, y);
		return myValue;
	}
	
	private int getMin(int x, int y)
	{
		int myValue=  Math.min(x, y);
		return myValue;
	}
}
