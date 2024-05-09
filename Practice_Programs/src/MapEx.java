import java.util.HashMap;

public class MapEx {
	public static void main(String[] args) {
		HashMap<String, Object> hm = new HashMap<>();
		hm.put("Fname", "Virat");
		hm.put("City", "Bangalore");
		hm.put("Position", "Batsman");
		System.out.println("Checking the key "+hm.containsKey("City"));
//		System.out.println("Check the Given values present in the Map " + hm.containsValue("Virat"));
//		System.out.println("All Entries present in given map is " + " " + hm.entrySet());
	}
}
 