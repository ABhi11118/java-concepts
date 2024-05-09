
public class PrimeNumCheck {
	public static void main(String[] args) {
		int n = 19;
		int count = 0;
		//		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println("It is not a Prime Num");
		} else {
			for (int i = 2; i < n/2; i++) {
				if (n % i == 0) {
					System.out.println("Not a Prime Num");
					count = 1;
					break;
				}
			}
			if (count == 0)
				System.out.println("It is a Prime Num");
		}

	}
}
