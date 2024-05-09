package Upcasting_and_Downcasting;

public class CardExecution {
	public static void main(String[] args) {
		Card c1 = new DebitCard();
		Card c2 = new CreditCard();
		DebitCard d = (DebitCard) c1;
		CreditCard c = (CreditCard) c2;
//		c1.payment();
		d.payment();
		d.displayDebit();
//		c2.payment();
		c.payment();
		c.displayCredit();

	}
}
