package j12_상속.동물;

public class Tiger extends Animal{
	

	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
		//super.move();// 상위클래스의 move()를 호출
	}
	
	public void  hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}
