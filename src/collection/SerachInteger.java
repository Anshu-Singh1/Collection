package collection;
/* create  a tree set of integer value and search 100 is present or not if yes
 * find the character for the value 100
 */
import java.util.TreeSet;
public class SerachInteger {

	public static void main(String[] args) {
		TreeSet <Object> t=new TreeSet<>();
		t.add(233);
		t.add(6988);
		t.add(546);
		t.add(100);
		t.add(951);
		
		System.out.println("100 is present??? "+t.contains(100));

		for(Object i:t) {
			System.out.println(i);
		}
		

	}

}
