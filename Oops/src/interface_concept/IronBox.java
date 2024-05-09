package interface_concept;

public class IronBox implements Eswitch {
	public void switchOn() {
		System.out.println("Box is Getting Heated");
	}

	@Override
	public void switchoff() {
		System.out.println("Box is back to it's normal Temaprature");
	}
}
