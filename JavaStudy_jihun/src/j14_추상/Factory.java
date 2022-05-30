package j14_추상;
/*
 * 
 * abstract(추상)
 * 1. 추상 메소드 : return type 앞에 abstract 키워드가 붙는다.
 * 2. 추상 메소드는 일반 클래스 안에 선언할 수 없다.
 * 3. 상속 또는 구현된 클래스에서 무조건  override(재정의)가 되어야 한다.
 * 
 * 추상 클래스
 * 1. 클래스 type 앞에 abstract 키워드가 붙는다.
 * 2. 추상 클래스는 생성할 수 없다. (new를 할수없다 단순히 설계 역할만 한다.)
 * 3. 추상 메소드를 포함 할 수 있다. 하지만 추상 메소드를 꼭 포함하지는 않아도 된다.
 * 4. 
 */

// 추상 클래스
public abstract class Factory { //  추상메소드와 일치화시킴
	
	// 추상 메소드 // override 꼭 해야됨
	public abstract void start();  // 메소드가 추상형태이면 클래스도 추상형태이여야 한다. 즉 클래스타입 앞에도 abstract가 붙어야한다. 
	
	// 일반 메소드
	public void stop() {
		//System.out.println("공장을 멈춥니다.");
	}
}
