package collection;
import java.util.Vector;
public class VectorEx {

	public static void main(String[] args) {
		Vector<String> v=new Vector<>();
		System.out.println("Capacity is "+v.capacity());
		
		v.add("Black");
		v.add("blue");
		v.add("Green");
		v.add("violet");
		v.add("indigo");
		v.add("orANGE");
		v.add("red");
		System.out.println("element are "+v);
		System.out.println("capacity is "+v.capacity());
		v.add("pink");
		v.add("red");
		v.add("blue");
		v.add("White");
		System.out.println("size is "+v.size());
		System.out.println("After adding 11 elements to vector,capacity is "+v.capacity());
		System.err.println("First element of vector is "+v.firstElement());
		System.err.println("last element in vector is "+v.lastElement());
		
	}

}
