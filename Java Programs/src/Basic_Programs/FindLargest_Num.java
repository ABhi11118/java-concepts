package Basic_Programs;

public class FindLargest_Num {
	public static void main(String[] args) {
		int x = 10;
		int y = 24;
		int z = 22;
		if (x > y && x > z)
			System.out.println(x + " i.e x is  the largest num");
		else if (y > x && y > z)
			System.out.println(y + " i.e y is the largest num ");
		else
			System.out.println(z + " i.e z is the largest num");
	}
}
