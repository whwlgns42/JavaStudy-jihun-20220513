package 연습장;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 주문은 총 5개까지 가능
		String orderList[] = new String[5];
		int count = 0;
		int total = 0;
		
		while(true) {
			System.out.println("☆★☆★Cafe☆★☆★"); // 메뉴
			System.out.println("1.주문하기");
			System.out.println("2.취소하기");
			System.out.println("3.결제하기");
			System.out.println("4.끝내기");
			System.out.println("입력:");
			
			int num = sc.nextInt(); // 주문 입력
			
			if(num == 1) {
				String menuName = "";
				int menuPrice = 0;
				System.out.println("1. 아메키라노\t3800원");
				System.out.println("2. 에소프레소\t2400원");
				System.out.println("3. 카페라떼\t4200원");
				System.out.println("4. 밀크티\t\t5100원");
				System.out.println("5. 뒤로가기");
				System.out.println("주문할 메뉴번호:");
				
				int menuNum = sc.nextInt();
				if (menuNum == 1) {
					menuName = "아메리카노";
					menuPrice = 3800;
				}else if(menuNum == 2) {
					menuName = "에스프레소";
					menuPrice = 2400;
				}else if(menuNum == 3) {
					menuName = "카페라떼";
					menuPrice = 4200;
				}else if(menuNum == 4) {
					menuName = "밀크티";
					menuPrice = 5100;
				}else if (menuNum == 5) {
					continue;
				}else {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}
				total += menuPrice;
				
				orderList[count] = menuName;
				count++;
				
				System.out.println("주문한 메뉴는 " + menuName + "입니다.");
				System.out.println("가격은" + menuPrice + "입니다.");
				sc.nextLine();
				num = sc.nextInt();
				sc.nextLine();
			}
			
		}
	}
}