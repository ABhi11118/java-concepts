import java.util.ArrayList;
import java.util.Collections;

public class SortingOfAL {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(11);
		al.add(13);
		System.out.println("Before sorting " + al);
		System.out.println("After Sorting");
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
	}
}
