package 연습장;

public class Array {

	public static void main(String[] args) {

		int size = 0; // 배열의 사이즈를 넣기 위해 변수로 초기화 해준다.
		
		for(int i = 0; i < 100; i++) {		// 100번 반복을 돌려준다.
			if(i !=0 && i % 8 == 0) {		// i가 0이 아니고 8의 배수일때 size변수에 1씩 증가
				size++;						
			}
		}
		
		int[] numbers = new int[size];		// 배열 변수 선언 후 size변수의 크기에 해당하는 배열을 생성
		
		for(int i = 0, j = 0; i < 100; i++) {	// 100번 반복을 돌려준다.
			if(i !=0 && i % 8 == 0) {			// i가 0이 아니고 8의 배수일때 i의 값들을 
				numbers[j] = i;					// numners안에 j인덱스위치에 i값을 대입해준다.
				System.out.print((j+1)+ "번째 : " +numbers[j]+ "    " ); // 대입해준 i값이 j인덱스에 들어있어 j의 인덱스값을 출력해준다.
				j++;
			}
		}
		
		
		
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
//		int size = 0;
//		
//		for(int i = 0; i < 100; i++) {
//			if(i != 0 && i % 8 == 0) {
//				size++;
//			}
//		}
//		
//		int[] numbers = new int[size];
//		
//		for(int i = 0, j = 0; i < 100; i++) {
//			if(i != 0 && i % 8 ==0) {
//				numbers[j] = i;
//				System.out.println(numbers[j]);
//				j++;
//			}
//		}
//	}
//
//}
