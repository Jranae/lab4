import java.util.Random;
public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int num1 = generator.nextInt(8) + 3;
		int num2 = generator.nextInt(25) + 20;
		int num3 = generator.nextInt(51) - 20;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}

}
