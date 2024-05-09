
public class CustomMain {
	public static void main(String[] args) {
		try {
			throw new CustomException1(null);
		} catch (CustomException1 e) {
			System.out.println("Exception Handled");
		}
	}
}
