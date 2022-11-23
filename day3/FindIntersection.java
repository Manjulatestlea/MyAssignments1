package week1.day3;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] num1= {3,2,11,4,6,7};
int l1=num1.length;

int [] num2= {1,2,8,4,9,7};
int l2=num2.length;

for(int i=0; i<l1;i++) {
	for(int j=0; j<l2;j++) {
		if(num1[i]==num2[j])
		{
			System.out.println(num1[i]);
		}
		
	}
	
}

	}

}
