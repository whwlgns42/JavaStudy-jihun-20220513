package j06_반복;

public class While02 {

	public static void main(String[] args) {
		
		// 구구단 2단 출력
		/*
		 * 2 X 1 = 2
		 * 2 X 2 = 4
		 * 2 X 3 = 6
		 * ...
		 * 2 X 9 = 18
		 * 
		 */
		
		int num = 0;
		int dan = 2;
		
		while(num < 9) {
			System.out.println(dan + "x" + (num+1) + "=" + dan * (num+1));
			num++;
		}
	}

}
