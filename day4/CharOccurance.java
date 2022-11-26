package week1.day4;

public class CharOccurance {
	
	public static void main(String[] args) {
		
		String str="welcome to chennai";
		int count=0;
		char []ch=str.toCharArray();
		int len=ch.length;
		for (int i=0; i<len-1;i++) {
			if(ch[i]=='o') 
			{
				count=count+1;
				//System.out.println(ch[i]);
			}
			}
			
		System.out.println(count);
		
	}
}
