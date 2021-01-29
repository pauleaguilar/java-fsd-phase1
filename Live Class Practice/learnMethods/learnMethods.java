package learnMethods;

public class learnMethods {
	static double myDouble = 5.0;
	static float myFloat = 4;

	private static int returnAnInt(float x) {
		
		return (int)(x) ;
	}
	private static int returnAnInt(double x) {
		return (int)(x);
	}
	public static void main(String[] args) {
		Person mary = new Person("Mary", "Smith");
		Person unknown = new Person();
		
		System.out.println(mary.firstName + " " + mary.lastName);
		System.out.println(unknown.firstName);
		System.out.println(returnAnInt(myDouble));
		System.out.println(returnAnInt(myFloat));

	}

}
