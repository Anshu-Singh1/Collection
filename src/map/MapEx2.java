package map;
/*Create a Hash Map store element.
 * print the element by using for each loop.
 */
import java.util.*;
public class MapEx2 {
	
	
public static void main(String[] args) {
	HashMap<Integer,String> h=new HashMap<>();	
h.put(987654, "Booty more, Ranchi");
h.put(654789, "Jp nagar, bengaluru");
h.put(987123, "whitefield ,banglore");
h.put(456789, "BTM 2nd, Jp nagar");
System.out.println("Printing by using for each loop");
System.out.println(h.keySet());
System.out.println(h.values());

for(Integer i:h.keySet())
{
	System.out.println(i+"  "+h.get(i));
}


	}

}
