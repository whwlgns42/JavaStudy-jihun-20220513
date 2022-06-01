package j18_최상위클래스.entity;

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
	
	
	
	
}
