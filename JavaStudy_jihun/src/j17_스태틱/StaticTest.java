package j17_스태틱;

public class StaticTest {
	
	public static int count;  // 글자가 기울어진것이 스태틱이다.
	
	
	public static void staticMethodTest() {
		System.out.println("스태틱 메소드 [ " + count + " ]");    // 글자가 기울어진것이 스태틱이다.
	}
}
