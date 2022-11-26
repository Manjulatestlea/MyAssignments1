package week1.day4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1="stops";
		String text2="potss";
		int l1=text1.length();
		int l2=text2.length();
		//System.out.println(l1);
		if(l1==l2) {
			char []ch1=text1.toCharArray();
			char []ch2=text1.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			Boolean equal=Arrays.equals(ch1,ch2);
					if(equal)
					{
						System.out.println("Both words are same");
					}
					else
					{
					System.out.println("Both words are same");
					}
		}

	}
}
