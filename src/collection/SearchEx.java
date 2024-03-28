package collection;
/* create a tree set of character elements search z is present or not
 * print all the element by using for each loop */
import java.util.TreeSet;
public class SearchEx {

public static void main(String[] args) {
	TreeSet <Character> c=new TreeSet<>();
	c.add('s');
	c.add('e');
	c.add('o');
	c.add('p');
	c.add('g');
	System.out.println("Z is present ?????"+c.contains('z'));
	System.out.println("Element in Tree Set are");
	for(Character i:c) {
		System.out.println(i);
	}

		
		

	}

}
