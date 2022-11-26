package week1.day4;

public class FindTypes {

	public static void main(String[] args) {
		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		int  letter = 0, space = 0, num = 0, specialChar = 0;

		char [] ch=test.toCharArray();
		
		for(int i=0;i<ch.length; i++)
		{
						
		if(Character.isLetter(ch[i]))
			{
				letter=letter+1;
				//System.out.println(letter);
			
			}
		else if(Character.isDigit(ch[i]))
			{
				num=num+1;
			}
		else if(Character.isSpaceChar(ch[i]))
			{
				space=space+1;
			}
			else {
				specialChar=specialChar+1;
					
			}
		}
	
	System.out.println("Letters"+" "+ letter);
	System.out.println("Numbers"+" "+ num);
	System.out.println("spaces"+" "+ space);
	System.out.println("Specialcharacter"+" "+ specialChar);
	}

	
		}



