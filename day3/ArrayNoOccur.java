package week1.day3;

public class ArrayNoOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0; 
		int n=56;
		int [] mark={23,5,67,89,67,43,56,22,57,78,98,87,45,34,56,78,78,90,78,78,78,89,78 ,
                67,78};
		
		for (int i = 0; i < mark.length; i++) {
			if(mark[i]==n)
			{
				count++;
			}
	
		}
		 System.out.println("Find total number 56 is present :"+count);
	}

}
