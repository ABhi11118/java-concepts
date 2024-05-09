import java.util.Scanner;

public class PrintingNumPattern {
	public static void main(String[] args) {
		System.out.println("Enter no of rows");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(x + "");
				x++;

			}
			System.out.println("");
		}
	}
}
