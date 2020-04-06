package test5;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

public class Group extends TreeSet{

	public static void main(String[] args) {
		
		HashSet h=new HashSet<>();
		List list=new Vector<>();
		//List values= new HashSet<>();
		Group g=new Group();
		g.add(new Person("Hans"));
		g.add(new Person("Jane"));
		g.add(new Person("Hans"));
		System.out.println("Total "+g.size());
	}
	public boolean add(Object o){
		System.out.println("adding here "+o);
		return super.add(o);
	}

}
class Person{
	private final String name;
	public Person(String name)
	{
		this.name=name;
	}
}
