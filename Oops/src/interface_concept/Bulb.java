package interface_concept;

public class Bulb implements Eswitch {

	@Override
	public void switchOn() {
		System.out.println("Light Turns On");
	}

	@Override
	public void switchoff() {
		System.out.println("Light turns Off");
	}

}
