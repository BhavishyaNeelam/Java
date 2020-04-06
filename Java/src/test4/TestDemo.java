package test4;

public class TestDemo {

	public static void main(String[] args) {
	/*Integer n1=new Integer(100);
	Integer n2=new Integer(100);
	Integer n3=127;
	Integer n4=127;
	Integer n5=128;   //auto boxing uses Integer.valueOf() method to convert Integer to int and since method caches Integer object for range -128 to 127, it return same Integer object in heap, and that's why == operator return true if you compare two Integer object in the range -128 to 127, but return false afterwards, causing bug.
	Integer n6=128;
	int n7=129;
	int n8=129;
	System.out.println(n1==n2); 
	System.out.println(n3==n4);//true
	System.out.println(n5==n6);//false
	System.out.println(n7==n8);
	System.out.println("---------------");*/
	
	String value1="Hello";
	String value2=new String("Hello");
	System.out.println(value1.equals(value2));
	System.out.println(value1==value2);
			
	String value3=value2.intern();
	System.out.println(value3);
	System.out.println(value1==value3);
	System.out.println(value1.equals(value3));
	}

}
