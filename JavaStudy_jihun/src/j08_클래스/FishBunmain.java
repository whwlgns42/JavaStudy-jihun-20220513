package j08_클래스;

public class FishBunmain {

	public static void main(String[] args) {
		
// 클래스도 자료형이다.
		
// 	new FishBun();  --> 값(메소드의형태임)
		
// FishBun();  --> 호출 즉, 객체를 생성하는 것
		FishBun fishBun = new FishBun(); // 객체 생성
		
		fishBun.showInfo();
		fishBun.material = "팥";
		fishBun.dough = "부트러운 반죽";
		fishBun.showInfo();
		 
		System.out.println("==========================");
		
		FishBun fishBun2 = new FishBun(); // 객체 생성
		
		fishBun2.showInfo();
		fishBun2.material = "슈크림";
		fishBun2.dough = "퍽퍽한 반죽";
		fishBun2.showInfo();
		fishBun.showInfo();
		
		System.out.println(fishBun);
		System.out.println(fishBun2);
		
	}

}
