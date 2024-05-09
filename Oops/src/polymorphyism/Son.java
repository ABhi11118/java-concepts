package polymorphyism;

public class Son extends Father{
	public void jobProfile() {
		super.jobProfile(); //It'll call Parent class methods 
		System.out.println("Private job and no Pension");
	}
}
