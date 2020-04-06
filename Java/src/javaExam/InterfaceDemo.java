package javaExam;

public interface InterfaceDemo {

	Void display1(int x);
	default void display(int x){}
	
	Void display(int x){}
	
	public static void display(int x){}
	
	public interface Demo{}
}
