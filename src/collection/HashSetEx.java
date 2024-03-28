package collection;
import java.util.HashSet;
public class HashSetEx {

	public static void main(String[] args) {
HashSet <Integer> h=new HashSet<>();
h.add(56);
h.add(41);
h.add(69);
h.add(87);
h.add(12);
h.add(null);
h.add(null);
for(Integer i:h)
{
	System.out.println(i);
}

	}

}
