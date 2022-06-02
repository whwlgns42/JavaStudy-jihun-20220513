package 연습장.최상위클래스;

import java.util.Objects;

public class Class {
	
	private String name;
	private String subject;
	private int num;
	
	public Class() {
		// TODO Auto-generated constructor stub
	}

	public Class(String name, String subject, int num) {
		super();
		this.name = name;
		this.subject = subject;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, num, subject);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Class other = (Class) obj;
		return Objects.equals(name, other.name) && num == other.num && Objects.equals(subject, other.subject);
	}

	@Override
	public String toString() {
		return "Class [name=" + name + ", subject=" + subject + ", num=" + num + "]";
	}

	
	
	
	
	
	
	
}
