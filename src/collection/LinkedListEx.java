package collection;
import java.util.LinkedList;
public class LinkedListEx {

	public static void main(String[] args) {
	LinkedList <Integer> l=new LinkedList<>();
	l.add(100);
	l.add(5000);
	l.add(200);
	l.add(7000);
	System.out.println(l);
	System.out.println(l.peek());
	System.out.println(l);
System.out.println(l.poll());
	
	System.out.println(l);
	System.out.println(l.peekLast());
	//System.out.println(l.peek());
	//System.out.println(l.pollLast());
	System.out.println(l);
	}

}
