package Basic_Programs;

import java.util.Scanner;

public class Fact_Of_num {
	public static void main(String[] args) {
		int n, c, fact = 1;
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n < 0)
			System.out.println("It is a negitive number");
		else {
			for (c = 1; c <= n; c++) {
				fact = fact * c;
			}
			System.out.println("Factorial of a given number is " + fact);
		}

	}
}
