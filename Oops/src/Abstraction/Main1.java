package Abstraction;

public class Main1 {
	public static void main(String[] args) {
		Bulb b=new Bulb();
		IronBox i=new IronBox();
		b.welcome();
		b.switchOn();
		b.switchOff();
		i.switchOn();
		i.switchOff();
//		Eswitch e=new Bulb();
//		Eswitch i=new IronBox();
//		e.welcome();
//		e.switchOn();
//		i.switchOn();
	}
}
