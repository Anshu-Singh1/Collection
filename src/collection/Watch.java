package collection;
/* write a java program to store objects to hash set and print only watch details
 * with brand name is Titan.
 */
import java.util.HashSet;
public class Watch {
String brand;
int price;
String color;
public Watch(String brand,int price,String color)
{
	super();
	this.brand=brand;
	this.price=price;
	this.color=color;
}
public String toString() {
	return brand+" "+price+" "+color;
}
public static void main(String[] args) {
	HashSet <Object> w=new HashSet<>();
	w.add(new Watch("Titan",3999,"Black"));
	System.out.println("Watch details "+w);
	
}
			
}

