package Class연습장;

import java.util.Scanner;

public class CarMaintest {

	public static void main(String[] args) {
		/*
		 * 1. Car 클래스를 만든다.
		 * 2. Car 클래스의 속성(변수) 제조사(company), 모델(model), color(색상)
		 * 3. Car 클래그의 기능(메소드)
		 * 
		 *  showCompanyInfo() -> 000회사에서 제조된 차량입니다.
		 *  
		 *  showInfoAll() -> 
		 *  제조자 : KIA
		 *  모델 : K5
		 *  색상 : 화이트
		 *  
		 *  getCar() -> return KIA_K5_화이트
		 *  setColor() -> 매개변수에 색상을 받아서 color 변수의 값을 변경
		 *  
		 *  KIA, K7, 블랙 - setColor(블루)
		 *  현대자동차, 소나타, 화이트 - setColor(그레이)
		 *  Tesla, Model3, 레드 - setColor(그린)
		 */
		
		Cartest c1 = new Cartest();
		Cartest c2 = new Cartest();
		Cartest c3 = new Cartest();
		
		Scanner sc = new Scanner(System.in);
		
		c1.company = "기아";
		c2.company = "현대";
		c3.company = "테슬라";
		
		c1.model = "k7";
		c2.model = "소나타";
		c3.model = "모델3";
		
		c1.color = "블랙";
		c2.color = "화이트";
		c3.color = "레드";
		
		c1.showCompanyInfo();
		System.out.println();
		c2.showCompanyInfo();
		System.out.println();
		c3.showCompanyInfo();
		System.out.println();
		System.out.println();
		c1.showInfoAll();
		System.out.println();
		c2.showInfoAll();
		System.out.println();
		c3.showInfoAll();
		System.out.println();
		System.out.println(c1.getCar());
		System.out.println(c2.getCar());
		System.out.println(c3.getCar());
		System.out.println("블랙이라고 입력해주세요");
		String input = sc.nextLine();
		
		c1.setColor(input);
		c2.setColor("그레이");
		c3.setColor("그린");
		
		c1.showInfoAll();
		System.out.println();
		c2.showInfoAll();
		System.out.println();
		c3.showInfoAll();
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
