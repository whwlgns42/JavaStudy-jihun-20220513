package j06_반복;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		int i = 0;
		int result = 0;
		
		while(i < 100) {
			result = result + (i+1);
			i++; // 조건 변화 수식
		}
		System.out.println(result);	
	}

}
