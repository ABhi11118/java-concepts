package interface_concept;

import Abstraction.Bulb;
import Abstraction.Eswitch;
import Abstraction.IronBox;

public class InterfaceExcexution {
	public static void main(String[] args) {
		Eswitch e = new Bulb();
		e.switchOn();
		e.switchOff();
		Eswitch i = new IronBox();
		i.switchOn();
		i.switchOff();
	}
}
