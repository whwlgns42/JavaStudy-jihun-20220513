package j18_최상위클래스.entity;

import java.util.Objects;

/*
 * -- 밑에 있는 형태로 셋팅 -- 무조건...
 * 상품 정보 클래스(Entity Class)
 * 
 * 변수     (중심)
 * productCode
 * ProductName
 * category
 * productionDate
 * 
 * 기본생성자
 * 
 * 전체생성자
 * 
 * getter, setter
 * 
 * hashCode()
 * 
 * equals()
 * 
 * toString()
 * 
 */

public class School {
	
	private int schoolNumner;
	private String schoolName;
	private String schoolType;
	
	public School() {
		// TODO Auto-generated constructor stub
	}

	public School(int schoolNumner, String schoolName, String schoolType) {
		super();
		this.schoolNumner = schoolNumner;
		this.schoolName = schoolName;
		this.schoolType = schoolType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(schoolName, schoolNumner, schoolType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		return Objects.equals(schoolName, other.schoolName) && schoolNumner == other.schoolNumner
				&& Objects.equals(schoolType, other.schoolType);
	}

	@Override
	public String toString() {
		return "School [schoolNumner=" + schoolNumner + ", schoolName=" + schoolName + ", schoolType=" + schoolType
				+ "]";
	}
	 
	
	
	
	
}
