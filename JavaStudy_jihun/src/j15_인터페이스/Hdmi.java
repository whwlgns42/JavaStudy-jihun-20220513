package j15_인터페이스;
/*
 * 
 * 인터페이스(interface)
 * 
 * 약속
 * 클래스와 클래스를 연결...
 * 
 * 1. 기본적으로 모든 메소드는 추상 메소드이다.
 * 2. 일반 메소드를 사용하고 싶다면 return type 앞에 default 키워드를 사용하여야 한다.
 */
public interface Hdmi { // 인터페이스는 일반메소드형식x 추상메소드형식o, 인터페이스는 무조건 추상메소드
	public void connect();
	public void disconnect();
	
	//public default void disconnect() {  // 일반메소든 만드는 방식 
		
	//}
	
}
