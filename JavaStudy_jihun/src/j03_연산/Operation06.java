package j03_연산;

public class Operation06 {

	public static void main(String[] args) {
		int num = 80;
		
		String result = num % 4 == 0 ? "4의 배수" : "4의 배수가 아님";
		boolean result2 = num % 4 == 0 ? true : false;
		int result3 = num % 4 == 0 ? 1 : 0;
		// 좌변과 우변의 자료형을 일치 시켜준다.
		
		
		System.out.println(num % 4 == 0 ? "4의 배수" : "4의 배수가 아님");
		System.out.println(num % 4 == 0 ? "4의 배수" : "4의 배수가 아님");
		
		

	}

}
