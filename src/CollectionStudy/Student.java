package CollectionStudy;

import java.util.Objects;

public class Student implements Comparable<Student> {
	String student;
	int roll;
	public Student(String student, int roll){
		this.student = student;
		this.roll = roll;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student-->{ Name : " + student 
				+ ", Roll No : "+ roll;
	}
	@Override
	public int hashCode() {
		return Objects.hash(roll);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return roll == other.roll;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
