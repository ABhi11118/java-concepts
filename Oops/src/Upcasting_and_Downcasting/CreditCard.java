package Upcasting_and_Downcasting;

public class CreditCard extends Card {
	public void payment() {
		System.out.println("Your Payment is Started with Credit Card");
	}

	public void displayCredit() {
		System.out.println("Your card limit id Decressed");
	}
}
