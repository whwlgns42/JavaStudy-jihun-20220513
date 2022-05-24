package j08_클래스;
/*
 * 1. Car 클래스를 만든다.
 * 2. Car 클래스의 속성(변수) 제조사(compamy), 모델(model), color(색상)
 * 3. Car 클래그의 기능(메소드)
 *  showCompanyInfo() -> 000회사에서 제조된 차량입니다.
 *  showInfoAll() -> 
 *  제조자 : KIA
 *  모델 : K5
 *  색상 : 화이트
 *  getCar() -> return KIA_K5_화이트
 *  setColor() -> 매개변수에 색상을 받아서 color 변수의 값을 변경
 *  
 *  KIA, K7, 블랙 - setColor(블루)
 *  현대자동차, 소나타, 화이트 - setColor(그레이)
 *  Tesla, Model3, 레드 - setColor(그린)
 */

public class Car {
	String company;
	String model;
	String color;
	

void showCompanyInfo() {
	System.out.println(company + "회사에서 제조된 차량입니다.");
}

void showInfoAll() {
	System.out.println("제조사: " + company);
	System.out.println("모델: " + model);
	System.out.println("색상: " + color);
	
}

String getCar() {
	return company + "_" + model + "_" + color;
}

void setColor(String color2) {
	this.color = color2;
}

}