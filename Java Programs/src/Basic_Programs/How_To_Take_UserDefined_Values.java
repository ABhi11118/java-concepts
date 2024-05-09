package Basic_Programs;

import java.util.Scanner;

public class How_To_Take_UserDefined_Values {
	public static void main(String[] args) {
		int a;
		float b;
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int Value");
		a = sc.nextInt(); // to take int values
		System.out.println("Your Enterd integer  value is " + a);
		System.out.println("Enter floating value");
		b = sc.nextFloat();
		System.out.println("Your floating value is " + b);
		System.out.println("Enter String value");
		s = sc.next();
		System.out.println("Your String  value is " + s);

	}
}
