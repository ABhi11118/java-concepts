import java.util.HashSet;
import java.util.Set;

public class SortingOfString {
	public static void main(String[] args) {
		String str[] = { "Google", "FB", "Google", "Youtube", "FB" };
		Set<String> s1 = new HashSet<>();
		for (String s : str) {
			s1.add(s);
		}
		System.out.println(s1);
	}
}
