package j23_예외처리;

/*
 * 프로그램의 오류
 * 1. 예외(프로그램이 실행 중) RuntimeException
 * 2. 컴파일 에러 -> ex) 드라이버 IOException
 * 3. 버그
 * 
 * 
 */

public class ArrayException01 {

	public static void main(String[] args) {

		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		try { // 오류가 날법한 곳에서 try로 묶어준다.
			for(int i = 0; i < numbers.length + 1; i++){
				System.out.println("index" + i + ": " + numbers[i]);
			}
		}catch (StringIndexOutOfBoundsException e) { // e: 최상위 클래스에 있는 toString가 출력
			System.out.println(e);
			System.out.println("StringIndexOutOfBoundsException 예외가 발생하였음.");
		}catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		System.out.println("지금 까지 진행한 작업을 저장합니다.");
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
	
	
	}
}
