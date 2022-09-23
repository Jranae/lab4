import java.util.Scanner;

public class MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		// ax^2 + bx +c 
		double discriminant, root1, root2;
		
		Scanner scan = new Scanner(System.in);
		//getting user input using scanner class for a,b,c
		System.out.println("Enter a: ");
		double a = scan.nextDouble();
		System.out.println("Enter b: ");
		double b = scan.nextDouble();
		System.out.println("Enter c: ");
		double c= scan.nextDouble();
		
		discriminant = (Math.sqrt(Math.pow(b,2)- (4*a*c)));
		root1 = (-b + discriminant)/(2*a);
		root2 = (-b - discriminant)/(2*a);
		System.out.println("Root1 is : " + root1);
		System.out.println("Root2 is : " + root2 );
		
	}

}
