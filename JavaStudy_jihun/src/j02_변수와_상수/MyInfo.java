package j02_변수와_상수;

public class MyInfo {

	public static void main(String[] args) {
		// 주석
		/*
		 * 메모, 필기 
		 * 1. 문제
		 * name1, name2, name3
		 * age(나이)
		 * phone(연락처)
		 * address(주소)
		 * 
		 */
		
		char name1 = '조';
		char name2 = '지';
		char name3 = '훈';
		int age = 29;
		String adress = "부산시 진구";
		String phone = "010-0000-0000";
		
		
		System.out.println("이름:"+name1+name2+name3);
	
		System.out.println("나이:"+age);
		
		System.out.println("연락처:"+phone);
		
		System.out.println("주소:"+adress);
		
		System.out.println("세수의 합:"+(10+20+30)); // 문자열이 되기때문에 수의 합은 연산되지 않는다.// 
													//숫자 양끝에 괄호를 넣어 우선으로 연산후 앞의 문자열과 합치면 숫자가 연산이 된다.
		
		
		System.out.print("이름: ");
		System.out.println(""+name1+name2+name3); // 16진수 AC01 -> 10진수 
		
		
		
		
	}

}
