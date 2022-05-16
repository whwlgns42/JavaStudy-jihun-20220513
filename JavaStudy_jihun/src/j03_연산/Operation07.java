package j03_연산;

public class Operation07 {

	public static void main(String[] args) {
		
		 /* 윤년이면 true 아니면 false 
		 * 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때
		 * 참이면 윤년
		 * 거짓이면 윤년이 아님
		 */
		
		int year = 2000;
		
		String result = null;			// Sting을 쓸땐 첫글자는 대문자로 써야한다.
		
		result = year % 4 == 0 		// 변수명은 한번 선언했으면 또 다시 하면 안된다.
				&& year % 100 != 0 
				|| year % 400 == 0 ? "윤년" : "윤년이 아님";
		
		System.out.println("결과: " + result);
		

	}

}
