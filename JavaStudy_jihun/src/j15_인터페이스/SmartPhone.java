package j15_인터페이스;

public class SmartPhone {
	
	private final Hdmi hdmi; //  final을 쓰면 무조건 값이 대입이 되어야한다.
	
	public SmartPhone(Hdmi hdmi) {
		this.hdmi = hdmi;
		
		
	}
	
	public void powerOn() {
		System.out.println("스마트폰의 전원을 켭니다.");
		hdmi.connect();
	}
	
	public void poweOff() {
		System.out.println("스마트폰의 전원을 끕니다.");
		hdmi.disconnect();
	}
}
