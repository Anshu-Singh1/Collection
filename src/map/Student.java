package map;
/*create a hash map of student object Roll no as key ,name&contact as the student details.
 * print all the element by  using for each loop.
 */
import java.util.*;
public class Student {
String name;
int roll;
long cont;
public Student(String name,int roll,long cont)
{
	super();
	this.name=name;
	this.roll=roll;
	this.cont=cont;
}
public String toString() {
	
	return name+" "+roll+" "+cont;
}
public static void main(String[] args) {
	HashMap<Integer,Object> hm=new HashMap<>();
	hm.put(101, "Anshu,987654321");
	hm.put(102, "Deepak,8709674863");
	hm.put(103, "Sunny,986541237");
	hm.put(104, "Suraj,784569321");
	System.out.println(hm.entrySet());
	System.out.println(hm.keySet());
	System.out.println(hm.values());
	for(Integer i:hm.keySet())
	{
		System.out.println(i+" "+hm.get(i));
	}
	
}
}

