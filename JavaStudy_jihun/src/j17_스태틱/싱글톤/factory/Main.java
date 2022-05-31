package j17_스태틱.싱글톤.factory;

public class Main {

	public static void main(String[] args) {
		KIA kiaFactory1 = KIA.getInstance();
		KIA kiaFactory2 = KIA.getInstance();
		KIA kiaFactory3 = KIA.getInstance();
		
		
		
		
		
		Car k5_01 = kiaFactory1.creatCar("k5");
		Car k5_01 = kiaFactory1.creatCar("k5");
		
	}

}
