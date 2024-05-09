package Basic_Programs;

import java.util.Scanner;

public class Fahrenhit_to_Celsius {
	public static void main(String[] args) {
		float temparature;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temparature in Fahrenhit");
		temparature = sc.nextInt();
		temparature = ((temparature - 32)*5) / 9;
		System.out.println("Temparature in Celsius is " + temparature);
	}
}
 