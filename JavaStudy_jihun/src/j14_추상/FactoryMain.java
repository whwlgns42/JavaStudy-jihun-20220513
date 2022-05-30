package j14_추상;

public class FactoryMain {

	public static void main(String[] args) {
		
		Factory samsungFactory = new SamsungFactory();
		Factory lgFactory = new LgFactory();
		
		// Factory클래스를 상속받은 모든 클래스(인스턴스)를 담을 수 있는 공간 2개의 배열 생성
		Factory[] factorys = new Factory[2]; 	
		
		factorys[0] = new SamsungFactory();	// 업캐스팅	// factorys변수명으로 배열을 만든 0번 인덱스에 SamsungFactory이라는 클래스를 넣는다.
		factorys[1] = new LgFactory();	// 업캐스팅		// factorys변수명으로 배열을 만든 0번 인덱스에 LgFactory이라는 클래스를 넣는다.
		
		
		for(Factory factory1 : factorys) {	// foreach: 처음부터 끝까지 반복	// for문을 돌려서 factorys에 있는 0번째 인덱스값과 1번째 인덱스값을 factory라는 변수에 넣어서 start()메소드를 실행시킨다. 
			factory1.start();
		}
		
		for(Factory factory : factorys) {	// foreach: 처음부터 끝까지 반복
			factory.stop();
			
		}
		
	
	}

}
