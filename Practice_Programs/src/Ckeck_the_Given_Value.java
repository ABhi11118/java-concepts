import java.util.Scanner;

public class Ckeck_the_Given_Value {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	
	if(x>=-9&&x<=9)
		System.out.println("It is a Digit");
	else
		System.out.println("It is a Number");
}
}
