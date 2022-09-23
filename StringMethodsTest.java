
public class StringMethodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phrase = "Change is inevitable";
		
		String mutation1, mutation2, mutation3;
		System.out.println(phrase);
		System.out.println(phrase.length());
		
		String phrase1 = " except from vending machines";
		mutation1 = phrase.concat(phrase1);
		System.out.println(mutation1);
		mutation2 = mutation1.toUpperCase();
	
		System.out.println(mutation2);
		mutation3 = mutation2.substring(3);
		System.out.println(mutation3);
		System.out.println(mutation1.length());
		System.out.println(mutation2.length());
		System.out.println(mutation3.length());
		String mutation4 = mutation1 + mutation2 + mutation3;
		System.out.println(mutation4.length());
	
	}
}
