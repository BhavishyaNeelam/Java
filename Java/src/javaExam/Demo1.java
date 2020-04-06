package javaExam;


class Person implements ProtoType
{
	String name;
	public Person(String name)
	{
		this.name=name;
	}
	public ProtoType doClone()
	{
		return new Person(name); //name is null here
	}
}
public class Demo1 {

	public static void main(String[] args) {
		Person person1=new Person("Clone");
		Person person2=(Person)person1.doClone();
		Person person3=person1;
		System.out.println((person1==person2)+" "+(person1==person3));
		
	}

}
