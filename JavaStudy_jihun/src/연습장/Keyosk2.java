package 연습장;

import java.util.Scanner;

public class Keyosk2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Ordernum = 0;
		int cups = 0;
		
		System.out.println("카페에 오신걸 환영합니다.");
		System.out.println();
		System.out.println("1. 주문하기");
		
		Ordernum = sc.nextInt();
		if(Ordernum ==1) {
			while(true) {
				System.out.println("1. 아메리카노 : 2000원");
				System.out.println("2. 카페라떼 : 3000원");
				System.out.println("3. 카페모카 : 4000원");
				System.out.println("4. 돌체라떼 : 5000원");
				
				System.out.println("주문번호를 입력해주세요");
				
				Ordernum = sc.nextInt();
				
				if(Ordernum == 1) {
					System.out.println("아메리카노1 입니다.");
					System.out.println("아메리카노2 입니다.");
					System.out.println("아메리카노3 입니다.");
					System.out.println("뒤로가기");
					
					Ordernum = sc.nextInt();
					
					if(Ordernum == 1) {
						System.out.println("아메리카노1은 1000원입니다.");
						break;
					}else if(Ordernum ==2) {
						System.out.println("아메리카노2은 2000원입니다.");
					}else if(Ordernum == 3) {
						System.out.println("아메리카노3은 3000원입니다.");
					}else if(Ordernum == 4) {
						continue;
					}
						
						
				}else if(Ordernum == 2) {			
					while(true) {
						System.out.println("카페라떼1 입니다.");
						System.out.println("카페라떼2 입니다.");
						System.out.println("카페라떼3 입니다.");
						System.out.println("뒤로가기");
						
						Ordernum = sc.nextInt();
							if(Ordernum == 1) {
								System.out.println("카페라떼는 1000원입니다.");
								System.out.println("2. 뒤로가기");
								
								Ordernum = sc.nextInt();
								if(Ordernum == 2) {
									continue;
								}
							
							}else if(Ordernum == 2) {
							System.out.println("카페라떼2는 2000원입니다.");
							System.out.println("2. 뒤로가기");
							
							Ordernum = sc.nextInt();
							if(Ordernum == 2) {
								continue;
							}
							
							
							}else if(Ordernum == 3) {
							System.out.println("카페라떼3은 3000원입니다.");
							}
						}
					}
				}
			}
		}
	}
