package j18_최상위클래스;

public class Main {

	//Object obj = t1; // 업캐스팅 가능(Object로 상속 또는 구현이 되었다.)
	public static void main(String[] args) {
		
		Teacher t1 = new Teacher("조지훈", "웹개발");
		Teacher t2 = new Teacher("조지훈", "웹개발");
	
		System.out.println(t1.toString()); // 주소가 출력. (특징) : t1뒤에 .toString이 생략이 되어있음     toString 생략가능
		System.out.println(t2); // toString 생략
		System.out.println(t1 == t2);
		System.out.println(t1.equals(t2)); // 
		System.out.println(t1.hashCode() == t2.hashCode());
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	
		
		
	}
	
}
