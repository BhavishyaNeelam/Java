package javaExam;


class Light{
	boolean isOn;
	void turnOn()
	{
		isOn=true;
	}
	
	void turnOff()
	{
		isOn=false;
	}
}
public class LightDemo {

	public static void main(String[] args) {
		
		int n=1_234; //_ can come in between numbers
		double d=1_234_.0;  //_ cannot come next to decimals
		double d1=1_234._0;
		double d2=1_234.0_; //_ cannot come at the start or end of a number
		long num=1_000_00;
		
		
		Light l1=new Light();
		Light l2=new Light();
		l1.turnOn();
		System.out.println(l1.isOn);
		l1.turnOff();
		System.out.println(l1.isOn);
		System.out.println(l2.isOn); //false

	}

}
