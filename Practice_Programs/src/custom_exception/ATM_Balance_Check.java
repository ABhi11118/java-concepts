package custom_exception;

public class ATM_Balance_Check {
public static void main(String[] args) {
	try {
		throw new InSufficientBalannceException("There is no Sufficient Balance in your Account");
	} catch (InSufficientBalannceException e) {
		// TODO: handle exception
		System.out.println("Exception Handled");
		System.out.println(e.getMessage());
		System.out.println(e.getStackTrace());
	}
}
}
 