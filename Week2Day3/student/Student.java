package org.student;

import org.departmen.Department;

public class Student extends Department{
	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("studentName : Hari");

	}
	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("studentDept : IT");
	}
	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("studentId : 7777");
	}
	public static void main(String[] args) {
		System.out.println("Multilevel inheritance:");
		Student obj=new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentId();
		obj.studentDept();
	}
	
}
