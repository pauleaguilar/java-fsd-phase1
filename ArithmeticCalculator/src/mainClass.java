import java.util.Scanner;
public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		calculator cal = new calculator();
		System.out.println("Enter the first number: ");
		double first = scan.nextDouble();
		System.out.println("Enter the second number: ");
		double second = scan.nextDouble();
		
		System.out.println("Which operation would you like to use");
		System.out.println("1.Addition 2.Subtraction 3.Division 4. Multiplication");
		int choice = scan.nextInt();
		
		scan.close();
		
		if(choice == 1) {
			System.out.print(first +" + "+ second +" = "+ cal.add(first,second));
		}
		
		else if(choice == 2) {
			System.out.print(first +" - "+ second +" = "+ cal.subtract(first,second));
		}
		
		else if(choice == 3) {
			System.out.print(first +" / "+ second +" = "+ cal.divide(first,second));
		}
		
		else if(choice == 4) {
			System.out.print(first +" * "+ second +" = "+ cal.multiply(first,second));
		}
		
	
		
	}

}
