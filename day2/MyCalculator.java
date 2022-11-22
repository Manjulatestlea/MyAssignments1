package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator obj1=new Calculator();
		int addval= obj1.add(10, 5);
		System.out.println("Value of Addtion " + addval);
		
		int subval= obj1.sub(10, 5);
		System.out.println("Value of Subration " + subval);
		
		double mulval= obj1.mul(10.222, 5.33);
		System.out.println("Value of Multiplication " + mulval);
		
		float divval= obj1.divide(10.6f, 5.34f);
		System.out.println("Value of Division " + divval);
	}

}
