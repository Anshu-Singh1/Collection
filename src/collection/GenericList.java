package collection;
//import java.util.Scanner;
import java.util.ArrayList;
public class GenericList {

	public static void main(String[] args) {
	//Scanner s=new Scanner(System.in);	
ArrayList <Object> ob=new ArrayList<>();
System.out.println("enter String value");
//String j=s.next();
ob.add("black");
ob.add("red");
ob.add("blue");
ob.add("green");
for(int i=0;i<ob.size();i++)
{
	System.out.println(ob.get(i));
}
System.out.println("============");
	
	for(Object i:ob)
	{
		System.out.println(i);
	}
}
}
	

		
	


