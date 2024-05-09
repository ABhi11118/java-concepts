package Basic_Programs;

import java.util.Scanner;

public class SwappingWithoutTemp {
	public static void main(String[] args) {
		int x, y;
		System.out.println("Enter the values of x and y");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("before swapping values of x and y are " + x + "," + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After Swapping " + "x is  " + x + " and y is " + y);
	}
}
