
public class PrintingOddElementsInArray {
public static void main(String[] args) {
	int arr[]={10,11,12,13,14};
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]%2!=0)
		System.out.println(arr[i]);
	}
	
}
}
