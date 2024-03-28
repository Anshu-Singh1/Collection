package collection;
import java.util.ArrayList;
import java.util.Collections;
public class SortList {

	public static void main(String[] args) {
		ArrayList <String> ob=new ArrayList<>();
		ob.add("Black");
		ob.add("Blue");
		ob.add("Green");
		ob.add("red");
		System.out.println(ob);
		Collections.sort(ob);
		System.out.println("After sorting "+ob);
		ob.add(null);
		Collections.sort(ob);
		System.out.println("After sorting with null is"+ob);
		

	}

}
