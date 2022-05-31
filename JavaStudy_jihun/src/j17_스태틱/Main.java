package j17_스태틱;

public class Main {

	public static void main(String[] args) {
		Test t  = new Test();
		Test t2  = new Test();
		Test t3  = new Test();
		
		t.count = 10;
		t2.count = 20;
		t3.count = 30;
		
		t.method();
		t2.method();
		t3.method();
		
		
//		StaticTest st = new StaticTest();
//		StaticTest st2 = new StaticTest();
//		StaticTest st3 = new StaticTest();
//		
//		st.count = 10;
//		st2.count = 20;
//		st3.count = 30;
		
//		st.staticMethodTest();
//		st2.staticMethodTest();
//		st3.staticMethodTest();
		
		
		
		StaticTest.count = 100; // 스태틱의 특성 : 공유 , 생성하지않고 가져다가 쓰기, 
		
		StaticTest.staticMethodTest();  // 글자가 기울어진것이 스태틱이다.
		
	}

}
