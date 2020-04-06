package javaExam;
class Employee{
	void disp(char c)
	{
		System.out.println("Employee name starts with "+c);
		System.out.println("His experience is 11 years");
	}
	
}

class Main extends Employee
{
	void disp(char c)
	{
		super.disp(c);
		System.out.println("Another employee name also starts with "+c);
		new Employee().disp('D');
		disp(7);
	}
	
	String disp(int c)
	{
		System.out.println("His experience is "+c+"years");
		return "Bye";
		
	}
}
public class Example13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e=new Main();
e.disp('S');
	}

}
