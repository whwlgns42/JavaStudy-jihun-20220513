package j11_배열;

public class Array02 {

	public static void main(String[] args) {

		
		//for문으로 0~99까지 반복
		//변수 i의 값이 8의 배수이면
		// 8의 배수 갯수만큼 배열을 생성
		// 8의 배수를 모두 배열에 대입
		// 배열에 들어있는 8의 배수들을 모두 출력
		
		
		int size = 0; // 8의배수의 갯수
		
		for(int i = 0; i< 100; i++) {		// 0~100까지 반복을 돌림
			if(i != 0 && i % 8 ==0) {		// i값이 0이 아니고  8의 배수이면
				size++;						// size값이 1이 증가
			}
		}
		
		int[] numbers = new int[size]; // 8의 갯수(12개) 만큼 배열 생성
		
		for(int i = 0, j = 0; i < 100; i++) { 	// 0~100까지 반복을 돌림
			if(i != 0 && i % 8==0) {			// i값이 0이 아니거나  8의 배수이면
				numbers[j] = i;					// numbers배열 변수에 i값(0이 아니고 8의배수이면 numbers[j]에 대입)
				System.out.print(numbers[j]);
				j++;							// numbers의 배열값 증가 
			}
		}
		
//		for(int i = 0; i< numbers.length; i++) {// 0부터 배열의크기(12)번 까지 반복
//			System.out.print(numbers[i]+" ");	// 배열의 크기 12개의 인덱스 값들이 출력됨
//		}
//		System.out.println();
//		System.out.println(size + "개");
	}

}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

