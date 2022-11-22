package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=17;
		boolean isprime= true;
		
		for(int i=2; i<n-1; i++)
		{
			if(n%i == 0)
			{
				isprime=false;
			}
			 
				
		}
		System.out.println("Give no PRIME is "+isprime);

	}

}
