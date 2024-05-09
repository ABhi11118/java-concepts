package encapsulation;

public class AccountExecution {
	public static void main(String[] args) {
		Account ac = new Account();
		ac.setAccount_no(754578563654l);
		ac.setName("Krishna Rdy");
		ac.setBalance(499999f);
		System.out.println(ac.getName() + " " + ac.getAccount_no() + " " + ac.getBalance());
	}
}
 