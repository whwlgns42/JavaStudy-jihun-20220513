package j04_입력;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  // 클래스자료형 = 참조자료형

 		System.out.print("첫번째 값 입력: ");
		int num = scanner.nextInt();
		System.out.print("두번째 값 입력: ");
		int num2 = scanner.nextInt();
		System.out.println("입력한 값:" + (num + num2));
		
		
		scanner.next();				// 문자열(String)
		scanner.nextLine();			// 문자열(String)
		scanner.next().charAt(0);	// 문자(char)
		scanner.nextInt();			// 정수(int)
		scanner.nextDouble();		// 실수(double)
		

		

	}

}
