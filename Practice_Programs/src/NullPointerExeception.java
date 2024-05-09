
public class NullPointerExeception {
	public static void main(String[] args) {
		String s = "Ram";
//		System.out.println(s.charAt(5));
		try {
			System.out.println(s.charAt(5));
		} catch (StringIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Exception Handled");
		}
	}
}
