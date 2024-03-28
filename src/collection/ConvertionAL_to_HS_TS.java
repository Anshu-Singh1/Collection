package collection;
/* create an array list of string elements 
 * ADD some string value and print by using for each loop
 * Convert this array to
 * ->hash set and print element
 * ->tree set and print element */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
public class ConvertionAL_to_HS_TS {

	public static void main(String[] args) {
		ArrayList <String> a=new ArrayList<>();
		a.add("Japan");
		a.add("Ukrain");
		a.add("India");
		a.add("Pope");
		a.add("Oblique");
		for(String i:a)
		{
			System.out.println("priint all element "+i);
		}
HashSet<String> d=new HashSet<>(a);
//d.containsAll(a);
System.out.println(d);
	
	TreeSet<String> e=new TreeSet<>(a);
	e.add("Huhu");
	//e.containsAll(a);
	System.out.println(e);
	}
}
