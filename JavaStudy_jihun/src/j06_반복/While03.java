package j06_반복;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		/*
		 * 반복할 횟수를 입력하세요>>>  5 
		 * 
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 * 
		 */
		
		
		// 1씩 증가
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("반복 횟수 입력>>>");
		num = sc.nextInt();
		int i = 0;  // 초기화
		while(i < num) { 
			System.out.println((i+1));
			i++;
		}
		
		// 1씩 감소
		i = 0;
		while(i<num) {
			System.out.println((num -i));
			i++;
		}
	}
}
