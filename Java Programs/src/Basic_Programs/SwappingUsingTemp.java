package Basic_Programs;

import java.util.Scanner;

public class SwappingUsingTemp {
	public static void main(String[] args) {
		int a, b, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of a and b ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Before Swapping a and b values are " + a + "and" + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("Values After Swapping  " + " a is " + a + " b is " + b);
	}
}
