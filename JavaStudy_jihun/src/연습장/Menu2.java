package 연습장;

import java.util.Scanner;

public class Menu2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean on = true;
		int price = 0;
		int money = 0;
		
		
		System.out.println("카페에 오신걸 환영합니다.");
		
	while(on) {
		char orderNum = 0;
		char answer = 0;
		
			System.out.println("[ 메뉴 선택]");
			System.out.println("1. (커피1)");
			System.out.println("2. (커피2)");
			System.out.println("3. (커피3)");
			System.out.println("4. 가게 나가기");
			
			System.out.println("주문번호를 입력해주세요");
			orderNum =sc.next().charAt(0);
			sc.nextLine();
			
			if(orderNum == '4') { //주문번호 4번 선택
				break;		// 가게 나가기
				
			}else if(orderNum == '1') { // 주문번호 1선택
					System.out.println("커피가격은 1000원 입니다. 드릴까요?  (1: 네  2: 아니요" );
					
					answer = sc.next().charAt(0);	// 대답 듣기
					sc.nextLine();
			
					if(answer == '1') {
						price += 1000;
						System.out.println("가격은 " + price + "입니다.");
						sc.nextLine();
					}else if (answer == '2') {
						System.out.println("메뉴를 다시 보여드립니다.");
						System.out.println();
					}else {
						System.out.println("제대로 입력해주세요");
			}
			
			}
		}
			
		}
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("돈을 넣어주세요");
//		while(on) {
//			int order = 0;
//			money = sc.nextInt();
//			sc.nextLine();
//			
//			if(money>999) {
//				System.out.println("[ 메뉴 선택]");
//				System.out.println("1. (커피1)");
//				System.out.println("2. (커피2)");
//				System.out.println("3. (커피3)");
//				System.out.println("4. 가게 나가기");
//			}else if(money<999) {
//				System.out.println("돈이 부족합니다 다시 돈을 넣어주세요");
//				continue;
//			}
//				order = sc.nextInt();
//				sc.nextLine();
//				
//				}if(order == 1) {
//					System.out.println("(커피1)의 가격은 1000원 입니다.");
//					System.out.println("(커피1) 드릴까요 네 // 아니요");
//					
//					order = sc.nextInt();
//					sc.nextLine();
//					
//					if(answer == "네") {
//						System.out.println("1000원입니다.");
//						price += 1000;
//					}
//				}
//		}
//	}
//					
//					
//					
//					
//					
//					
//					
//					
//					
//					
//					
//					
//					
//					
//					
//					
//					
//					
//	//			}else{
//	//				while(on) {
//	//					int order = 0;
//	//					
//	//					
//	//					System.out.println("번호를 눌러주세요");
//	//					order = sc.nextInt();
//	//					sc.nextLine();
//	//					
//	//					if(order == '1') {
//	//						System.out.println("가격은 1000원 입니다. (커피1)로 드릴까요?");
//	//						System.out.println("네 // 아니요");
//	//						order =sc.nextInt();
//	//						sc.nextLine();
//	//						
//	//					}
//	//					
//	//						
//	//					}
//	//			}
//	//		
//	//		}
//	//	
//	//			}
//	//		
//	//		
//			
//				
//				