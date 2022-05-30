package j11_배열;

public class Foreach {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
			if(numbers.length-1 != i) {
				System.out.print(",");
			}
	
			
		}
		System.out.println();
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + (numbers.length-1 != i ? "," : ""));
		}
		
		
		int i = 0;
		System.out.println();
		for(int num : numbers) { // numbers배열에 있는 0번 인덱스값을 num변수에 차례대로 넣는다.
			System.out.print(num + (numbers.length-1 != i ? "," : "")); // numbers배열에 들어있는 값을 모두 출력이 된다.
			i++;
		}
		
		
	}

}
