package collection;
import java.util.ArrayList;
import java.util.Collections;
public class MergeListEx2 {

	

	public static void main(String[] args) {
		ArrayList<Integer> ob=new ArrayList<>();
		ob.add(125);
		ob.add(65);
		ob.add(45);
		System.out.println(ob);
	
		Collections.sort(ob);
		
		System.out.println(ob);
		
	}

}
