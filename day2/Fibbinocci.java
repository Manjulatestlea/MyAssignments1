package week1.day2;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int firstNum=0;
int secNum=1;
int n=11;
for (int i = 0; i < n; i++) 
{
	System.out.println(firstNum+"\n");
	int sum=firstNum+secNum;
	firstNum=secNum;
	secNum=sum;
	
	
}



	}

}
