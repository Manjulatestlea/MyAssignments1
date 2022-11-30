package week2day3;

public class Calci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator obj=new Calculator();
int resut1=obj.add(2, 2);
System.out.println(resut1);

int result2=obj.add(2, 2, 2);
System.out.println(result2);

double result3=obj.sub(100.5, 50.75);
System.out.println(result3);

double result4=obj.sub(10, 2);
System.out.println(result4);

obj.mul(3, 33);
//System.out.println(result5);

double result6= obj.mul(2.11, 2.22);
System.out.println(result6);
//lassRoom2:
//Create class Calculator with below methods:
//- 2 methods for add. 1 method with 2 int args. 1 method with 3 int args
//- 2 method for sub. 1 method with 2 double args. 1 method with 2 int args
//- 2 method for mul. 1 method with 1 int and 1 double. 1 method with 2 double
//ClassRoom3:
//Create the takeVideo method in SmartPhone. Verify if it gets executed from SmartPhone
//	
}

}
