package j07_메소드;

import java.util.Scanner;

public class Menu {

	public static char inputSelect() {
		Scanner scanner = new Scanner(System.in);
		char selet = 0;
		System.out.println("명령");
		select = scanner.next().charAt(0);
		scanner.nextLine();
		
		return select;
		
	public static char showMenu1() {
		while(true) {
		}
		char select = 0;
		
		System.out.println("[ 메뉴 선택]");
		System.out.println("1. java");
		System.out.println("2. python");
		System.out.println("3. javascript");
		System.out.println("q. 프로그램 종료");
		
		select = inputSelect();
		
		
		if(select == 'q') {
			break;
			
		}else if(select == '1') {
			System.out.println("java를 선택하셨습니다.");
			while(loopFlag) {
				System.out.println("[java 메뉴]");
				System.out.println("[1. java란]");
				System.out.println("[b. 뒤로가기]");
				
				System.out.println("명령어를 입력하세요");
				select = sc.next().charAt(0);
				sc.nextLine();
				
				if(select == 'b') {
					break;
				}else if(select == 'q') {
					loopFlag = false;
				}else if (select == '1') {
					System.out.println("자바란 ...입니다.");
					System.out.println("계속하시려면 엔터를 눌러주세요");
					sc.nextLine();
					}
				}
///////////////////////////////////////////////////////////////////////////////////////////////////////				
			
		}else if(select == '2') {
					System.out.println("python를 선택하셨습니다.");
					while(true) {
						System.out.println("[python 메뉴]");
						System.out.println("[1. python]란");
						System.out.println("[b. 뒤로가기]");
						
						System.out.println("명령어를 입력하세요");
						select = sc.next().charAt(0);
						sc.nextLine();
						
						if(select == '1') {
							System.out.println("python이란...입니다.");
							System.out.println("계속하시려면 엔터를 눌러주세요");
						}else if(select == 'b') {
							break;
						}
					}
				}
	}
}
}
		return ' ';
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean loopFlag = true;
		
		System.out.println("프로그램 시작");
		
		while(loopFlag) {
			char select = 0;
			
			System.out.println("[ 메뉴 선택]");
			System.out.println("1. java");
			System.out.println("2. python");
			System.out.println("3. javascript");
			System.out.println("q. 프로그램 종료");
			
			System.out.print("명령 입력 >>>");
			select = sc.next().charAt(0);
			sc.nextLine();
			
			if(select == 'q') {
				break;
				
			}else if(select == '1') {
				System.out.println("java를 선택하셨습니다.");
				while(loopFlag) {
					System.out.println("[java 메뉴]");
					System.out.println("[1. java란]");
					System.out.println("[b. 뒤로가기]");
					
					System.out.println("명령어를 입력하세요");
					select = sc.next().charAt(0);
					sc.nextLine();
					
					if(select == 'b') {
						break;
					}else if(select == 'q') {
						loopFlag = false;
					}else if (select == '1') {
						System.out.println("자바란 ...입니다.");
						System.out.println("계속하시려면 엔터를 눌러주세요");
						sc.nextLine();
						}
					}
///////////////////////////////////////////////////////////////////////////////////////////////////////				
				
			}else if(select == '2') {
						System.out.println("python를 선택하셨습니다.");
						while(true) {
							System.out.println("[python 메뉴]");
							System.out.println("[1. python]란");
							System.out.println("[b. 뒤로가기]");
							
							System.out.println("명령어를 입력하세요");
							select = sc.next().charAt(0);
							sc.nextLine();
							
							if(select == '1') {
								System.out.println("python이란...입니다.");
								System.out.println("계속하시려면 엔터를 눌러주세요");
							}else if(select == 'b') {
								break;
							}
						}
					}
		}
	}
}

					
//						
//							}else if(select == '3') {
//								System.out.println("javascript를 선택하셨습니다.");
//								System.out.print("계속하시려면 엔터를 눌러주세요");
//								sc.nextLine();
//								
//							}else {
//								System.out.println("해당 명령은 보기에 없습니다.");
//								System.out.println("다시 입력하세요");
//							}
//							
//									System.out.println("프로그램 종료");
//							}
//						}
//					}
