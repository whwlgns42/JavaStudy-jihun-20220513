package j04_입력;

import java.util.Scanner;

public class Input03 {

	public static void main(String[] args) {
		/*
		 * [개인정보 입력 ]
		 * 이름 : 조지훈
		 * 나이 : 29
		 * 연락처 : 010-0000-0000
		 * 주소 : 부산시 진구
		 * 성별 : 남
		 * 
		 * 	 * 문자열1 입력: next()				안녕
		 * 문자열2 입력: nextLine()			hi
		 * 문자 입력: next().charAt(0)		A
		 * 정수 입력: nextInt()				10
		 * 실수 입력: nextDouble()			3.14
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		
		String name = null;
		String address = null;
		String nam = null;
		int age = 0;
		int phone = 0 ;
		
		System.out.print("이름 : ");
		name = scanner.next();
		
		System.out.print("나이 : ");
		age = scanner.nextInt();

		System.out.print("연락처 : ");
		phone = scanner.nextInt();
		
		System.out.print("주소 : ");
		address = scanner.next(); //next가 온뒤에는  그다음줄에 scnner.nextLine(); 버퍼에 남아있는
									// 엔터나 스페이스를 날려준다.
		scanner.nextLine();
		
		System.out.print("성별 : ");
		nam = scanner.nextLine();
		
		System.out.println("이름 => " + name);
		System.out.println("나이 => "+ age);
		System.out.println("연락처 => " +phone);
		System.out.println("주소 =>" +address);
		System.out.println("성별 =>" +nam);
	}

}
