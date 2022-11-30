package week2day3;

public class Students {

	public void getStudent(int id) {
		// TODO Auto-generated method stub
		System.out.println("Student Id :" +id);

	}
	public void getStudent(int id, String name) {
		// TODO Auto-generated method stub
		System.out.println("Student Id :" +id);
		System.out.println("Student Name :" +name);
		
	}
	public void getStudent(String email, int Phone) {
		// TODO Auto-generated method stub
		System.out.println("Student Email :" +email);
		System.out.println("Student Phone :" +Phone);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students obj=new Students();
		obj.getStudent(121212);
		obj.getStudent(7865, "Hari");
		obj.getStudent("Hari@gmail.com", 1234567891);
		
		
	}
}
