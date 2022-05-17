package j04_입력;

import java.util.Scanner;

public class Input05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		
	
		int a = 0;
		int b = 0;
		
		System.out.print("비교할 숫자를 입력해주세요 >>>");
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		System.out.println(a < b ? ">" : a < b ? "<" :"=="); // 모범답안
		// 삼항 연산자의 줄바꿈은 콜론앞에서 줄바꿈하면 된다.
		
		
	}

}
