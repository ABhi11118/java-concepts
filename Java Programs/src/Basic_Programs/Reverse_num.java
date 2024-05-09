package Basic_Programs;

import java.util.Scanner;

public class Reverse_num {
	public static void main(String[] args) {
		int rev = 0;
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n > 0) {
			int r = n % 10;
			rev = (rev * 10) + r;
			n = n / 10;
 
		}
		System.out.println("Reverse of number is " + rev);

	}
}
