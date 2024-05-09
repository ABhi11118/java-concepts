import java.util.Scanner;

public class Swapping_a_Num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x-value");
		int x = sc.nextInt();
		System.out.println("Enter y-value");
		int y = sc.nextInt();

		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("x-value is "+x);
		System.out.println("y-value is "+y);
	}
}
