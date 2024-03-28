package collection;
import java.util.TreeSet;
import java.util.HashSet;
public class TreeSetEX2 {

	public static void main(String[] args) {
		TreeSet <String> t=new TreeSet<>();
		t.add("black");
		t.add("Earth");
		t.add("India");
		t.add("Cricket");
		System.out.println(t);
		System.out.println(t.descendingSet());
		System.out.println(t.first());
		System.out.println(t.last());
		t.add(null);
		System.out.println(t);
		try
		{
			System.out.println("hjh");
		
	}
	catch(NullPointerException e)
	{
		
	}
	HashSet<String> h=new HashSet<>(t);
	System.out.println("HashSet elemnts"+h);
	h.add(null);
	System.out.println("After adding null into the HashSet"+h);
	}

}
