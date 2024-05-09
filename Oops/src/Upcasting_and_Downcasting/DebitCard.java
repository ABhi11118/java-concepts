package Upcasting_and_Downcasting;

public class DebitCard extends Card{
	public void payment() {
		System.out.println("Your Payment is Started with Debit Card");
	}

	public void displayDebit() {
		System.out.println("Balance is Debited from your card");
	}
}
