package collection;
//wjp to add bike object into array list. 
import java.util.ArrayList;

public class Bike {
String name;
long price;
String color;
public Bike(String name,long price,String color)
{
	super();
	this.name=name;
	this.price=price;
	this.color=color;
}
public String  toString ()
{
return name+" "+price+" "+color;
}
public static void main(String[] args) {
	ArrayList <Bike> b=new ArrayList<>();
	System.out.println("Name,price,color");
	b.add(new Bike("TVS",800000l,"Black"));
	b.add(new Bike("HERO",900000l,"RED"));
	b.add(new Bike("Suzuki",150000l,"Mate Balck"));
	for(int i=0;i<b.size();i++)
	{
		System.out.println(b.get(i));
	}
	System.out.println("printing for each loop");
	for(Bike i:b)
	{
		System.out.println(i);
}
}
}
