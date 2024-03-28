package collection;
/*write a java program to create an array list of String elements and print using for each loop.
 * Search hello present in the list or not.
 * NOTE-use contains method.
 * */
import java.util.ArrayList;
 
public class SearchEx2 {

	public static void main(String[] args) {
	ArrayList <String> s=new ArrayList<>();
	s.add("Song");
	s.add("hello");
	s.add("Dude");
	s.add("joker");
	s.add("pupa");
	s.add("eagle");

	
	System.out.println("hello is present ????? "+s.contains("hello"));
	System.out.println("Element in Arraylist are");
	for(String i:s)
	{
		System.out.println(i);
	}
	
	}

}
