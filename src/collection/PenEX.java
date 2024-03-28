package collection;
/* wjp to sort pen object based on price in a list*/
import java.util.ArrayList;

import java.util.Collections;

public  class PenEX  implements Comparable <PenEX>
{
String brand;
int price;
public PenEX(String brand,int price)
{
	this.brand=brand;
	this.price=price;
}
public int compareTo(PenEX ob)

{
if(this.price>ob.price)
return 1;
else if(this.price<ob.price)
	return -1;
else
	return 0;
}
public String toString()
{
	return brand+" "+price;
}



public static void main(String[] args) {
	ArrayList <PenEX> p=new ArrayList<>();
	p.add(new PenEX("cello",25));
	p.add(new PenEX("reynolds",30));
	p.add(new PenEX("link",20));
	p.add(new PenEX("casio",35));
	System.out.println("Before Sorting "+p);
	Collections.sort( p);
	System.out.println("After sorting "+p);
}



}




	



