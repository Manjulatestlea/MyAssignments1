package week1.day1;

public class Mobile {

	public void makeCall()
	{
		System.out.println("This is from makeCall Md");
	}
	
	public void sendMsg()
	{
		System.out.println("This is form sendMsg Md");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile obj1=new Mobile();
		obj1.makeCall();
		obj1.sendMsg();
		
	}

}
