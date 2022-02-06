package org.student;

import org.college.College;
import org.department.Department;

public class Student {
public void studentName() {
	System.out.println("K.Nagajothi");
}
public void studentDept() {
	System.out.println("CSE");
}
public void studentId() {
	System.out.println("1234");
}
public static void main(String[] args) {
	College obj = new College();
	Department obj2 = new Department();
	Student obj3 = new Student();
	obj.collegeName();
	obj.collegeCode();
	obj.collegeRank();
	obj2.deptName();
	obj3.studentName();
	obj3.studentDept();
	obj3.studentId();
}
}
