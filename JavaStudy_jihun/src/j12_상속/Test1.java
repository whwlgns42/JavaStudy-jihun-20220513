package j12_상속;

public class Test1 extends Test{//(상속을 받을 클래스) 
	
public Test1() {
	super(); // 생략이 되어 있다. , 부모 클래스 생성
	System.out.println(("T1 생성자 호출"));
	System.out.println("T1에서 확인: " + super.toString());
}
	// toString : 부모값 주소 출력
	// super() : 항상 맨위에 있어야한다. 대부분 생략되어있다.
	
}
