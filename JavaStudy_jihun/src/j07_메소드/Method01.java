package j07_메소드;

import java.util.Scanner;

public class Method01 {
	
	public static int clacFormula1(int a, int b, int c, int d, int e) { // 함수명 = 동산  / 변수명은 = 명사로 지어주어야 한다.
		int result = a + (b * c) - (d * e);
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, e;
		int r1, r2, r3, r4;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		
		// x + y = z
		
		
		r1 = clacFormula1(a,b,c,d,e);
		// 소스코드 만줄
		r2 = clacFormula1(10,20,5,30,2);
		// 소스코드 천줄
		r3 = clacFormula1(a,b,c,d,e);
		// 소스코드 이천줄
		r4 = clacFormula1(a,b,c,d,e);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	}

}
