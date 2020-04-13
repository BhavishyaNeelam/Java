package test4;

public class StringTest {

	public static void main(String[] args) {
		String joinString = String.join("*", "java", "programming","language");
		String s1="JAVA", s2="java",s3="Java";
		s1.toLowerCase();
		//System.out.println(s1.toLowerCase());
		//s3=s3.replace('J','j');
		System.out.println(joinString);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1.equals(s2)+","+(s2==s3));



	}

}
