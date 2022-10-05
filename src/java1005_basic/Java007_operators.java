package java1005_basic;

public class Java007_operators {
public static void main(String[] args) {
	
	int a = 10;
	int b = 3;
	System.out.println(a/b); // int/int => 
	float numA = (float)a;
	float numB = (float)b;
	System.out.println(numA/numB); //3.33333
	double sum = a/b;
	System.out.println(sum); //3.0
	
	System.out.println((double)(a/b)); //3.0
	System.out.println((double)a/b); //3.33333333
	
}
}
