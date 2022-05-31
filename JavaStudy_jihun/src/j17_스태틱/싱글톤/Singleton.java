package j17_스태틱.싱글톤;


/*
 * 1. 생성자는 private으로 지정하여 외부에서 생성할 수 없게 만들어야 한다.
 * 2. 싱글톤으로 설계된 클래스의 유일한 instance를 return해줄 수 있는 
 * 		getInstance() static 메소드가 존재해야 한다.
 * 3. 싱글톤 instance를 저장할 변수명이 intance인 static 변수가 존재해야 한다.
 * 
 */
public class Singleton {
	private static Singleton instance = new Singleton();  // 내부에서 클래스를 생성한다. 외부에서 생성이 안되기때문에
	private int count;
	
	private Singleton() {}  // 생성자는 외부에서 만들수없게 private로 준다. (유일한 객체, 외에서 생성x) ,단 외부에서 static로 가져올수있다.
							// 스태틱 안에서는 일반 변수를 쓸수가 없다. 
		public static Singleton getInstance() {
			if(instance == null) {
				instance = new Singleton();
			}
			return instance;
	}
		

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}
		
		public void printInfo() {
			System.out.println("싱글톤 테스트 ->" + count);
		}
		
		 
}
