package collection;
//Write a java program to merge two collection

import java.util.ArrayList;
public class MergeList {

	public static void main(String[] args) {
ArrayList <Object> a1=new ArrayList<>();
a1.add("Hiii");
a1.add(159);
a1.add(45.5f);
a1.add('S');
System.out.println("First list"+a1);
System.out.println("First list size is->"+a1.size());

ArrayList <Object> a2=new ArrayList<>();
a2.add("Bye");
a2.add("How are you");
a2.add(657);
a2.add(987.5f);
a2.add('A');
System.out.println("Second list"+a2);
System.out.println("Second list size is->"+a2.size());
a1.addAll(a2);
System.out.println("After merging a2 to a1 is"+a1);
System.out.println("After merging size of list is->"+a1.size());
a1.clear();
a2.clear();
System.out.println(a1);
System.out.println(a2);

	}

}
