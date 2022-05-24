package j08_클래스;

public class FishBun { // 클래스명은 대문자로
	String material; // 재료
	String dough; 
	
	FishBun(){ // 생성자
		System.out.println("생성자 호출");
		// 반환 자료형이없다.(void가 없다.)
		// 메소드는 무조건 소문자 (메소드가 아니다)
		
	}
	
	void showInfo() {
		System.out.println("재료: " + material);
		System.out.println("반죽: " + dough);
	}
}
