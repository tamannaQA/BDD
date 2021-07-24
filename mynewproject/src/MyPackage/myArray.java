package MyPackage;

public class myArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name=new String[8];
		name[0]="David";
		name[1]="David2";
		name[2]="David3";
		name[3]="David4";
		name[4]="David5";
		name[5]="David6";
		name[6]="David7";
		name[7]="David8";
		
		System.out.println("Name 1: " + name[0]);
		System.out.println("Name 1: " + name[1]);
		System.out.println("Name 1: " + name[2]);
		System.out.println("Name 1: " + name[3]);
		System.out.println("Name 1: " + name[4]);
		System.out.println("Name 1: " + name[5]);
		System.out.println("Name 1: " + name[6]);
		System.out.println("Name 1: " + name[7]);
		
		
		for(int i=0;i<name.length;i++)
		{
			System.out.println("Name" + i + ": " + name[i]);
			
		}
	}

}
