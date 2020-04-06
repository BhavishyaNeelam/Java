package test5;

import java.util.HashSet;

public class TestDemo2 {

	public static void main(String[] args) {
		HashSet myMap=new HashSet();
		String s1=new String("das");
		String s2=new String("das");
		NameBean s3=new NameBean("abcded");
		NameBean s4=new NameBean("abcded");
		myMap.add(s1);
		myMap.add(s2);
		myMap.add(s3);
		myMap.add(s4);
		System.out.println(myMap);

	}

}
class NameBean{
	private String str;
	 NameBean(String str) {
		this.str=str;
	}
	 public String toString(){
		 return str;
	 }
}