package collection;
import java.util.ArrayList;

public class SortListEx2 {

	public static void main(String[] args) {
	
ArrayList <String> ob =new ArrayList<>();
ob.add("Black");
ob.add("red");
ob.add("Green");
ob.add("blue");
System.out.println("Index of green ->"+ob.indexOf("Green"));
System.out.println("Size before adding ->"+ob.size());
ob.add(2,"White");//white is added to index number 2
System.out.println("Size after adding ->"+ob.size());
System.out.println(ob.indexOf("Green"));//green is shifted to next index number

	}

}
