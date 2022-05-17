package j04_입력;

import java.util.Scanner;

public class Input02 {

	public static void main(String[] args) {
		/*
		 * 문자열1 입력: next()				안녕
		 * 문자열2 입력: nextLine()			hi
		 * 문자 입력: next().charAt(0)		A
		 * 정수 입력: nextInt()				10
		 * 실수 입력: nextDouble()			3.14
		 */

	
		
		Scanner scanner  = new Scanner(System.in);
		String a = null;
		String b = null;
		char c = ' ';
		int d = 0;
		double e = 0;
		
		System.out.println("문자열 1 입력: ");
		a = scanner.nextLine();
		System.out.println("문자열 2 입력: ");
		b = scanner.next();
		System.out.println("문자 입력: ");
		c = scanner.next().charAt(0);
		System.out.println("정수입력: ");
		d = scanner.nextInt();
		System.out.println("a문자열 1 입력: ");
		
		System.out.println("a문자열 1 입력: ");
	}

}
