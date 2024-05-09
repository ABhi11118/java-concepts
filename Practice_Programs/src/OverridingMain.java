
public class OverridingMain {
	public static void main(String[] args) {
		Father f = new Father();
		f.jobProfile();
		Son s = new Son();
		s.jobProfile();        //iam created jobProfile() for two methods 
	}
}
