package j04_입력;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  // 클래스자료형 = 참조자료형
		
		System.out.print("갑 입력: ");
		int num = scanner.nextInt();
		
		System.out.println("입력한 갑:" + num);
		
		
		

	}

}
