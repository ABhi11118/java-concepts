
public class WrongException{
	public static void main(String[] args) {
		try {
			throw new CustomException(null);
		} catch (CustomException e) {
			// TODO: handle exception
			System.out.println("Exception Handled");
			System.out.println(e.getMessage());
		}
	}
}
