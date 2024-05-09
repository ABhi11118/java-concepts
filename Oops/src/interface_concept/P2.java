package interface_concept;

public class P2 implements Person {

	@Override
	public void run() {
		System.out.println("Runs fastlyy");
	}

	@Override
	public void eat() {
		System.out.println("eats only Non veg ");
	}

	@Override
	public void speak() {
		System.out.println("speaks kannada");
	}

	public static void main(String[] args) {
		P2 t = new P2();
		t.eat();
		t.run();
		t.speak();

	}

}
