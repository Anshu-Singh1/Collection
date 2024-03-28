package collection;
/*write a java program to store person object to hash set print element. 
 * convert to linked hash list print element. 
 * convert to tree set and print element.
 * convert it to array list and print element.
 * */


import java.util.*;

public class Person  implements Comparable<Person>{
String name;
int age;
long salary;
String add;
public Person(String name,int age,long salary,String add)
{
	super();
	this.name=name;
	this.age=age;
	this.salary=salary;
	this.add=add;
}
public String toString()
{
	return name+" "+age+" "+salary+" "+add;
}
public int compareTo(Person ob)
{
	if(this.salary>ob.salary)
		return 1;
	else if(this.salary<ob.salary)
		return -1;
	else 
		return 0;
}
public static void main(String[] args) {
	HashSet<Person> h=new HashSet<>();
	h.add(new Person("Anshu",26,800000l,"BTM"));
	h.add(new Person("vishal",27,750000l,"BTM 2nd"));
	h.add(new Person("Rahul",28,650000l,"JP nagar"));
	//for(Person i:h)
	//{
	System.out.println(h);

	//}
	LinkedHashSet<Person> l=new LinkedHashSet<>(h);
	l.containsAll(h);
	System.out.println(l);
	
	TreeSet <Person> t=new TreeSet<>(h);
	t.containsAll(h);
	//t.add(new Person("and",34,5600000000l,"dhf"));
    System.out.println(t);
}
}
