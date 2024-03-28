package map;
/* create a hash map with key as String value as object.*/
import java.util.*;
public class MapEx {

	public static void main(String[] args) {
		HashMap <String ,Object> hm=new HashMap<>();
		hm.put("Fname", "Anshu");
		hm.put("lname", "Singh");
		hm.put("Age", 26);
		hm.put(null, "Karanataka");
		System.out.println(hm.get("Age"));
		hm.put("Place", "bengaluru");
		System.out.println(hm.get("age"));
		System.out.println(hm.containsKey("place"));
		System.out.println(hm.containsKey("bombay"));
		System.out.println(hm.remove("Place"));
		System.out.println("After removing entries are "+hm.entrySet());
		System.out.println("All keys "+hm.keySet());
		System.out.println("All values "+hm.values());
		HashMap <String ,Object> ob=new HashMap<>();
		ob.put("Country", "India");
		System.out.println("Second hash map entries "+ob);
		ob.putAll(hm);
		System.out.println("After adding all element "+ob);
		hm.clear();
		System.out.println(hm);
	}

}
