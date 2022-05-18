package j05_조건;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 
		//출력하는 프로그램을 작성하시오
		
		
		Scanner scanner = new Scanner(System.in);
		
		int score = 0;
		
		System.out.print("점수 입력>>>");
		score = scanner.nextInt();
		
		if(score < 0 || score > 100) {
			System.out.println("계산 한 수 없는 점수입니다.");
		}else if(score > 89) {
			System.out.println("A");
		}else if(score > 79) {
			System.out.println("B");
		}else if(score > 69) {
			System.out.println("C");
		}else if(score > 59) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}