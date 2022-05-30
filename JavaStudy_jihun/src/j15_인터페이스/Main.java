package j15_인터페이스;

public class Main {

	public static void main(String[] args) {
		Monitor monitor = new Monitor();
		BeamProjector beamProjector = new BeamProjector();

		
		SmartPhone smartPhone = new SmartPhone(beamProjector);  // 업캐스팅이 됨
		smartPhone.powerOn();
		smartPhone.poweOff();
		
	}

}


//[상속과 인터페이스의 차이]

//1. 상속은 다중 상속이 불가능하다.
//2. 인터페이스는 다중 구현이 가능하다.
//3. 상속을 하는 경우는 상위 클래스와 하위 클래스의 관계가 쌍방이다
//4. 인터페이스를 하는 경우는 상위 클래스와 하위 클래스의 관계 가 단방향이다.
