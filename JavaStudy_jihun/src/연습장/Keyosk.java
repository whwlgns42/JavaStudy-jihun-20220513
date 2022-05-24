package 연습장;

import java.util.Scanner;

public class Keyosk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean on = true;
		int price = 0;
		String Menuname = null;
		int money = 0;
		int cups = 0;
		System.out.println("어서오세요");
		
		System.out.println("1. 주문하기"); // 주문하기 1번
		
		int Ordernum =sc.nextInt(); // 1번을 누르게 되면  if 1번을 출력한다.
		
		while(on) {  // 메뉴판을 언제든 보여줄수있도록 무한반복을 해준다
			if( Ordernum == 1) { // 주문 1번을 인식을 하여 메뉴판을 보여준다.
				System.out.println("1. 아메리카노 : 2000원");
				System.out.println("2. 카페라떼 : 3000원");
				System.out.println("3. 카페모카 : 4000원");
				System.out.println("4. 돌체라떼 : 5000원");
				
				System.out.print("주문번호를 입력하여 주세요");
				
				Ordernum = sc.nextInt();
				
				if(Ordernum == 1) {
					Menuname = "아메리카노";
					price = 2000;
					System.out.println(Menuname + " 선택하셨습니다.");
				}else if(Ordernum == 2 ) {
					Menuname = "카페라떼";
					price = 3000;
					System.out.println(Menuname + " 선택하셨습니다.");
				}else if(Ordernum == 3 ) {
					price = 4000;
					Menuname = "카페모카";
					System.out.println(Menuname + " 선택하셨습니다.");
				}else if(Ordernum == 4 ) {
					price = 5000;
					Menuname = "돌체라떼";
					System.out.println(Menuname + " 선택하셨습니다.");
				}else {
					System.out.println("잘못된 주문입니다. 다시 입력해주세요");
					continue;
				}System.out.println();
				
				System.out.println("돈을 입력해주세요");
				money = sc.nextInt();
				
				while(on) {
					System.out.println("1. 결제하기");
					System.out.println("2. 뒤로가기");
					
					Ordernum = sc.nextInt();
					
					
					if(Ordernum == 1) {
						System.out.println(money + "원을 받았습니다. " + "거스름돈" + (money - price) +"원입니다.");
					}else if(Ordernum == 2) {
						break;
					}
				}		
					
			}	
		}	
		
	}
}