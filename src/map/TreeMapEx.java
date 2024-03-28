package map;
import java.util.*;
public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap <Integer,String> tm=new TreeMap<>();
		tm.put(802715, "ranchi");
		tm.put(987654, "whithefield");
		tm.put(654987, "Jp nagar");
		tm.put(963215, "dhanbad");
		System.out.println("All mapping are "+tm.entrySet());
		//tm.putIfAbsent(802712 , "Bokaro");
		System.out.println("after adding,all maping are "+tm.entrySet());
		HashMap<Integer,String> hm=new HashMap<>(tm);
		System.out.println("Hashmap entries are "+hm.entrySet());
		
	}

}

