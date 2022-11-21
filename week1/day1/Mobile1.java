package week1.day1;

public class Mobile1 {
	
	char mobileLogo='@';
	short noOfMobilePiece=1000;
	int modelNumber=2635353;
	float mobilePrice=23.6f;
	boolean isDamaged= false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile1 obj1=new Mobile1();
		System.out.println("mobileLogo=" +obj1.mobileLogo);
		System.out.println("noOfMobilePiece=" +obj1.noOfMobilePiece);
		System.out.println("modelNumber=" +obj1.modelNumber);
		System.out.println("mobilePrice=" +obj1.mobilePrice);
		System.out.println("isDamaged=" +obj1.isDamaged);
	}

}
