package j17_스태틱.싱글톤.factory;

public class Main {

	public static void main(String[] args) {
		KIA kiaFactory1 = KIA.getInstance();
		KIA kiaFactory2 = KIA.getInstance();
		KIA kiaFactory3 = KIA.getInstance();
		
		Car k5_01 = kiaFactory1.creatCar("k5");
		Car k5_02 = kiaFactory1.creatCar("k5");
		
		kiaFactory1.carInfo(k5_01);
		kiaFactory1.carInfo(k5_02);
		
		Car k7_01 = kiaFactory1.creatCar("k7");
		Car k7_02 = kiaFactory1.creatCar("k7");
		
		kiaFactory1.carInfo(k7_01);
		kiaFactory1.carInfo(k7_02);
	}

}
