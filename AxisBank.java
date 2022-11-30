package week2day3;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("This is deposit from Axis Bank");
		super.deposit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank obj=new AxisBank();
		obj.saving();
		obj.fixed();
		obj.deposit();
	}

}
