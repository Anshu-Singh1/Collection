package map;
import java.util.*;

public class LHMEx {

	public static void main(String[] args) {
		LinkedHashMap<Integer ,String > hm=new LinkedHashMap<>();
		hm.put(698745, "JPnagar");
		hm.put(987456, "Banglore");
		hm.put(785645, "Ranchi");
		System.out.println(hm.entrySet());
		for(Integer i:hm.keySet())
		{
			System.out.println(hm.get(i));
		}

	}

}
