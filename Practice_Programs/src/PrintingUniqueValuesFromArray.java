import java.util.HashSet;

public class PrintingUniqueValuesFromArray {
public static void main(String[] args) {
//	by using hashset
	int arr[]= {1,2,5,1,4,4,8};
	HashSet<Integer>hs=new HashSet<>();
	for(int i=1;i<arr.length;i++) {
	if(!hs.contains(arr))
	{
		hs.add(arr[i]);
	}
	}
	System.out.println(hs);
}
}
