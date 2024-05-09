package interface_concept;

public class P1 implements Person {

	@Override
	public void run() {
		System.out.println("Runs slowly");
	}

	@Override
	public void eat() {
		System.out.println("Eats only Veg");
	}

	@Override
	public void speak() {
		System.out.println("Speaks only Telugu");
	}

	public static void main(String[] args) {
		P1 p = new P1();
		p.eat();
		p.run();
		p.speak();
	}
}
