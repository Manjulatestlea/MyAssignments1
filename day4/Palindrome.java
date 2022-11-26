package week1.day4;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="madam";
		String rev="";
		char []ch=name.toCharArray();
		int len=ch.length;
		for(int i=(len-1); i>=0;i--) {
			
			rev=rev+ch[i];
			//System.out.println(rev);
		}
			if(rev.equals(name)) {
				
				System.out.println("Name is Polindrome");
			}else
			{
				System.out.println("Name is Not Polindrome");
			}
			
			
			}

}
