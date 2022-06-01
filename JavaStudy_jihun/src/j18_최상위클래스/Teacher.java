package j18_최상위클래스;

import java.util.Objects;

/*
 * Object class(최상위 클래스)
 * 
 */


public class Teacher {

	private String name;
	private String subject;
	
	public Teacher(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}
	
	
	
	
	
	
	@Override
	public int hashCode() { // 해쉬코드의 자료형은 int형이다. 
		return Objects.hash(name, subject);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 주소가 같으면 true 반환
			return true; 
		if (obj == null) // 주소값이 다르면 false 반환
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return Objects.equals(name, other.name) && Objects.equals(subject, other.subject);
	}






	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subject=" + subject + "]";
	}
	
	public void classInfo() {
		System.out.println();
	}
	 
}
