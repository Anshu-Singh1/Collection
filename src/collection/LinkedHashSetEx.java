package collection;
import java.util.LinkedHashSet;
public class LinkedHashSetEx {

	public static void main(String[] args) {
		LinkedHashSet<Integer> l=new LinkedHashSet<>();
		l.add(100);
		l.add(123);
		l.add(987);
		l.add(875);
		l.add(875);
		System.out.println(l);

	}

}
