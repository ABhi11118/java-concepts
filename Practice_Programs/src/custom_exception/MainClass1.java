package custom_exception;

public class MainClass1 {
public static void main(String[] args) {
	try {
		throw new FakeException("this is FakeException");
	} catch (FakeException e) {
		// TODO: handle exception
		System.out.println("Exception Handled Sucessfully");
		System.out.println(e.getMessage());
	}
}
}
