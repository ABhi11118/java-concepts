import java.util.HashMap;
import java.util.HashSet;

public class PrintingElementsByUsingHashMap {
public static void main(String[] args) {
	int arr[]= {1,2,3,5,1,2,8,7,3};
	HashMap<Integer, Integer>hs=new HashMap<>();
	for(int i=1;i<arr.length;i++) {
		hs.put(arr[i], i);
	}
	System.out.println(hs.keySet());
}
}
  