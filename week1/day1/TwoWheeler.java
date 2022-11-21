package week1.day1;

public class TwoWheeler {
	
		
	int noOfWheels=4;
	float mileage=28.4f;
	boolean isPunctured= false;
	char bikeNameFirstLetter='S';


	public static void main(String[] args) {
		
  TwoWheeler obj1= new TwoWheeler();
				
	System.out.println("Car having "+obj1.noOfWheels+" Wheels");
	System.out.println("Giving Mileage "+ obj1.mileage);
	System.out.println("Is punctured ="+obj1.isPunctured);
	System.out.println("It's Maruthi with Symbol  "+obj1.bikeNameFirstLetter);
	}

}
