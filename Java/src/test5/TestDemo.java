package test5;

import java.util.Set;
import java.util.TreeSet;

public class TestDemo {

	public static void main(String[] args) {
		TreeSet tset=new TreeSet();
		tset.add(22);
		TreeSet b= tset;
		
		Set set=new TreeSet();
		set.add(1);
		set.add(2.7);
		set.add(2);
		for (Object object : set) {
			System.out.println(object);   
			
		}
		

	}

}
