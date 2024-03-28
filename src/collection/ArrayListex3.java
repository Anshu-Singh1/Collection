package collection;
import java.util.ArrayList;
public class ArrayListex3 {

	public static void main(String[] args) {
ArrayList <String> s=new ArrayList<>();
s.add("hii");
s.add("Hello");
s.add("bye");
System.out.println(s);
//System.out.println( s.peak());
for(int i=0;i<s.size();i++)
{
System.out.println(s.get(i));

}
for(String i:s)

{
	System.out.println(i);
}	
}
}


