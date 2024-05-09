package Upcasting_and_Downcasting;

public class Ola_Excecution {
	public static void main(String[] args) {
		Ola o1 = new Mini();
		Ola o2 = new Cab();
		Mini m = (Mini) o1;
		Cab c = (Cab) o2;
		o1.welcome();
		m.ride();
		m.display();
		o2.welcome();
		c.ride();
		c.display();
	}
}
