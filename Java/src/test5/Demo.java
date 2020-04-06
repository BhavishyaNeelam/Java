package test5;


import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<String> arrList=new ArrayList<String>();
		arrList.add("First");
		arrList.add("Second");
		arrList.add("23");
		for (String str : arrList) {
			System.out.println(str);
		}

	}

}
