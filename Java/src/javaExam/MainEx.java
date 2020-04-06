package javaExam;

public class MainEx {
	
	private int efd;
	private transient String dob;
	

	public static void main(String[] args) {

int twoD[][]= new int[4][];
//int twoD[0]= new int[1]; //compilation error

int x[][];
x=new int[3][4];
for (int i = 0; i < 3; i++) {
	for (int j = 0; j < 4; j++) {
		
		x[i][j]=i+j;
		System.out.print(x[i][j]+" ");
	}
}


	}

}
