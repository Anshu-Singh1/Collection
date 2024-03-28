package collection;
//write a java program of Watch using Tree set and print it.
import java.util.TreeSet;
public class WatchEx2 implements Comparable <WatchEx2> {
String brand;
int price;
String color;
public WatchEx2(String brand,int price,String color)
{
	super();
	this.brand=brand;
	this.price=price;
	this.color=color;
}
public int compareTo(WatchEx2 ob)
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
	
	return brand+" "+price+" "+color;
	
}
public static void main(String[] args) {
	TreeSet <WatchEx2> w=new TreeSet<>();
	w.add(new WatchEx2("Noise",2999,"Blue"));
	w.add(new WatchEx2("Titan",1500,"black"));
	w.add(new WatchEx2("fireboult",3999,"white"));
	System.out.println("printing watch object details in sorted order");
	for(WatchEx2 i:w)
	{
		System.out.println(i);
	}
	
}
}

