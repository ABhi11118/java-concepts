package polymorphyism;

public class Compile_Time_Polymorphism {
	public static void add() {
		System.out.println("Method with Zero Aurguments ");
	}

	public static void add(int a) {
		System.out.println("Method with one Aurgument");
		System.out.println(a + 10);
	}

	public static void add(int a, int b) {
		System.out.println("Method with 2 Aurguments");
		System.out.println(a + b);
	}
	public static void main(String[] args) {
		add();
		add(8);
		add(10, 7);

	}

}
