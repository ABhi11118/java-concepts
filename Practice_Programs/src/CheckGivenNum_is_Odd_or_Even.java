import java.util.Scanner;

public class CheckGivenNum_is_Odd_or_Even {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		if (n % 2 == 0) {
//			System.out.println("It is an Even Number");
//		} else
//			System.out.println("It is an Odd num");
		String s=(n%2==0)?"Even":"Odd";
		System.out.println(s);
	}
}
