
public class Return_Multiple_Values {
	public static  void main(String[] args) {
		System.out.println(display());
		System.out.println(display(24));
	}

public static String display() {
	int a=11;
	float b=51.25f;
	return a+" and  "+b;
	}
public static int display(int c) {
	return c*2;
}
}
