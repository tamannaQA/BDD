package MyPackage;

public class MyIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age =20;
		
		if (age >= 21)
		{
			System.out.println("The person is allowed to smoke because he is 21 years or older");
		}else if (age >=18)
		{
			System.out.println("“The person is an adult because he is 18 years or older");
		} else
		{
			System.out.println("The person is a minor because he is younger than 18 years.");
		}
	}

}
