package Day31_Method02;

import java.util.*;//brings all scanner method

public class Calculater {

	public static void main(String[] args) {
		// Class called Calculater
		//Add follwing methods
		//1.add ...>2  dauble arguments(Parameters,input)
		//add numbers and print that result
		//2. substract 2  dauble arguments(Parameters,input)
		//substract numbers and print that result
		//3.multibly 2  dauble arguments(Parameters,input)
		//multipilies numbers and print that result
		//4. divide 2  dauble arguments(Parameters,input)
		//divides numbers and print that result
	double n1=2;
	double n2=4;
		
		
		add(n1,n2);
		subtract(n1,n2);
		multibly(n1,n2);
		divide(n1,n2);
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter two numbers");
	 n1= scan.nextDouble();
	n2= scan.nextDouble();
	System.out.println("Choice operation: \n" + "1-add\n"+ "2-subract \n"+"3- multibly\n"+"divide");
	int operation=scan.nextInt();
	scan.close();
	switch(operation) {
	case 1:
		add(n1,n2);
		break;
	case 2:
		subtract(n1,n2);
		break;
	case 3:
		multibly(n1,n2);
		break;
	case 4:
		divide(n1,n2);
		break;
		
	default:
	System.out.println("Error can not divide zero");
		
	}
	}
	private static void multibly(double n1, double n2) {
		// TODO Auto-generated method stub
		
	}
	public static void add(double num1,double num2) {
		
		double result=num1+num2;
		System.out.println(result);

}
	public static void subtract(double num1,double num2) {
		
		double substract=num1-num2;
		System.out.println(substract);

}
	public static  double subraction(double num1,double num2) {
		
		double subraction=num1-num2;
	     return subraction;

	}
    public static void divide(double num1,double num2) {
 if(num2==0) {
	 System.out.println("Error");
	 }else {
		 double divide =num1/num2;
			System.out.println(divide);
			
	 }
 
 }
		
	
}
