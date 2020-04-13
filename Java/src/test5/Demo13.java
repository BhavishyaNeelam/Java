package test5;

import java.util.Collections;
import java.util.Comparator;

public class Demo13 implements Comparable {
	
private int number;
private String data;
Demo13(int i,String s)
{
	this.number=i;
	this.data=s;
}
public String toString()
{
	return ""+number;
}
	
	public static void main(String[] args) {
		Demo13 demo1=new Demo13(88,"a");
		Demo13 demo2=new Demo13(55,"b");
		Dem dem=new Dem();
		Collections.sort
		dem.compare(demo1, demo2)
	}
	public class Dem implements Comparator{
		public int compare(Demo13 demo1, Demo13 demo2) {
			return demo1.number-demo2.number;
		}
		
	}
/*	public int compare(Demo13 demo1, Demo13 demo2) {
		return demo1.number-demo2.number;
	}
	*/
	public int compareTo(Demo13 demo) {
		return data.compareTo(demo.data);
	}

}
