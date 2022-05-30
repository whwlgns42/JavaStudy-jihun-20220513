package j14_추상;

public class SamsungFactory extends Factory { // Factory를 abstract(추상클래스)를 시켰기때문에 삼성클래스도 추상클래스를 해주던가, start();를 override를 꼭 해줘야한다. 이렇게 두가지 방법이 있다.
	
	@Override
	public void start() {
		System.out.println("삼성 팩토리 가동");
}
	@Override
		public void stop() {
		System.out.println("삼성 공장을 멈춥니다.");
		}
			
		
	}
