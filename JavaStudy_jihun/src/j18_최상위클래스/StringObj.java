package j18_최상위클래스;

import java.util.Scanner;

public class StringObj {

	public static void main(String[] args) {
		
		String name = "조지훈"; // 조지훈 자체라는 문자열이 리터럴주소값이다.
		String name2 = "조지훈";
		
		System.out.println(name == name2);  // 그래서 조지훈이라는 문자열이 같기때문에 true가 나온다.
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("이름1: ");
		name = scanner.nextLine();
		System.out.println("이름2: ");
		name2 = scanner.nextLine();
		
		System.out.println(name == name2);  // 주소값을 비교하는 것

		name = new String("조지훈");
		name2 = new String("조지훈");
		
		System.out.println(name == name2);
		System.out.println(name.equals(name2));		// equals란 name,name2라는 주소안에 있는 정보값을 비교하는 것 (주소값을 비교하는것이 아님)
		
		
				
	}

}
