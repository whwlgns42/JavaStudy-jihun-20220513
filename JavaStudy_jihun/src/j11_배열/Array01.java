package j11_배열;

public class Array01 {

	public static void main(String[] args) {
		// 1. 배열의 공간(크기)을 정해서 생성 / 
		int[] numbers = new int[10];
		
		// 2. 배열에 들어갈 값을 미리 정해서 생성
		int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		char[] characters = {'a', 'b', 'c', 'd', 'e'};
		boolean[] booleans = {true, true, true, false, false, false};
		
		String[] strArray = new String[5];
		String str = "test";
		
		System.out.println("numners의 길이" +numbers.length);
		System.out.println("strArray의 길이: " + strArray.length);
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("i:" + i);
			System.out.println("numbers" + numbers[i]);
			System.out.println("numbers2:" + numbers2[i]);
			
		}
		

		//int[] numbers = new int[10];   //4바이트 10개를 1공간으로 묶는다. (묶음의 주소) 그주소를 number변수에 담아라. int[] : int를 넣을수있는 공간 자료형
		numbers[0] = 10;
		numbers[1] = 20;
		//numbers 라는 묶음에서 0번 인덱스값을 참조 
		System.out.println(numbers[0]); // 이 묶음 배열의 주소값
		
	}

}
