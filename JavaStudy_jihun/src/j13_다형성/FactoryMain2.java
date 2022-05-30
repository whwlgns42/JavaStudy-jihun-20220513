package j13_다형성;

public class FactoryMain2 {

	public static void main(String[] args) {
		Factory[] factorys = new Factory[100];
		
//		factorys[0] = new SmartPhoneFactory();
//		factorys[1] = new ComputerFactory();
		
		for(int i = 0; i < factorys.length; i++) {
			// 삼항연산자, 조건연산자
			factorys[i] = i % 2 == 0 ? new SmartPhoneFactory() : new ComputerFactory();
		}
		
		for(Factory factory : factorys){
			factory.start();
		}
		
		int i = 10; 
		double d = i;
		int ii = (int) d;
		
		System.out.println();
		
		for(Factory factory : factorys) {
			if(factory instanceof SmartPhoneFactory) {
				SmartPhoneFactory spf  = (SmartPhoneFactory) factory;
				
			}else if(factory instanceof ComputerFactory) {
				ComputerFactory cf = (ComputerFactory) factory;
				cf.showComputer();
				
			}else {
				System.out.println("다운캐스팅 할 수 없습니다");
			}
		}
	}
}