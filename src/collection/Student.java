package collection;
import java.util.ArrayList;

public class Student {

String name;
int age;
public Student(String name,int age)
{
	super();
	this.name=name;
	this.age=age;
}
public String toString ()
{
	return name+" "+age;
}
public static void main(String[] args) {
	ArrayList<Student> a=new ArrayList<>();
	a.add(new Student ("Anshu",25));
	a.add(new Student ("vishal",27));
	a.add(new Student ("Deepak",38));
System.out.println(a);
////	for(int i=0;i<a.size();i++)
////	{
////		System.out.println(a.get(i));
////		
////	}
//	System.out.println("Printing using for each loop");
//	for(Student a1:a);
//	{
//		
//   System.out.println(a1);
//	}
//		



	}
	}


