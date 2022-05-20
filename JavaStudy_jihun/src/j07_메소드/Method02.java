package j07_메소드;

// 클래스 안에 정의된 함수를 메소드라고 한다.

public class Method02 {
	
	// 매개변수가 없으면서 반환도 없는 메소드 
	public static void test1() { 
		System.out.println("test1 메소드 실행"); // 메인함수에서 호출을해서 test1()을 출력한다.
	}
	
	// 매개변수는 있고 반환이 없는 메소드v  // void : 뜻이 공허하다라는의미로 리턴이 없다라는 뜻이다.
	public static void test2(int age, int year) {  // 반환이 없으면 void를 쓴다
		System.out.println("나이" + age);
		System.out.println("출생년도" + year);
	}
	
	// 매개변수가 없고 반환이 있는 메소드
	public static String test3() {  // String로 리턴을 했기때문에 String를쓴다. 문자열만 리턴할수있다. //   (String : 클래스 , 즉 클래스도 반환이 가능하다.)
		return "조지훈";
	}
	
	public static int test4() {  // 자료형이 같아야만 리턴할수있다. 리턴값을 문자열로 쓰게되면 안된다. 리턴자료형과 반환자료형을 일치
		return 10000;
	}
	
	// 매개변수도 있고 반환도 있는 메소드
	public static String test5(String name, int num) {
		return name + num;
	}
	
	// 리턴자료형이 void일 때 메소드를 강제로 탈출하는 방법
	public static void test6() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 6) {
				System.out.println("메소드 탈출");
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("메인함수 시작");
		test1(); // 호출
		test2(29, 1994);
		String name = test3();
		System.out.println(name);
		test3();  // test3() <--이 자체가 "조지훈" 자체가 값이된다.
		System.out.println(test3()); //  조지훈이라는 값이 출력이된다.
		System.out.println(test5("조지훈", 1));
		test6();
		System.out.println("메인함수 끝");
	}

}
  // 리턴을 어디서든지 호출이 가능하다.
