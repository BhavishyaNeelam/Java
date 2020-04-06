package test5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestDemo1 {

	public static void main(String[] args) {
		ArrayList strings=new ArrayList<>();
		strings.add("aAaA");
		strings.add("AaA");
		strings.add("aAa");
		strings.add("AAaa");
		//Collections.sort(strings);
		for (Object object : strings) {
			System.out.println(object);	
		}//System.out.println(string);
/*for (String string : strings) {
	System.out.println(string);
}
*/	}

}
