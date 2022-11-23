package week1.day3;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ch = {1,2,3,4,7,6,8};
		Arrays.sort(ch);
		for(int i=0; i<ch.length; i++) {
			if(ch[i]!=i+1)
			{
				System.out.println(i+1);
				break;
			}
			
		}
		
	}

}
