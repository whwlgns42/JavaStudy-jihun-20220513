package j23_예외처리;

public class Throw01Main {

	public void test() throws Exception {
		Throws01 throws01 = new Throws01();
		
		throws01.printArray(new int[] {1,2,3,4,5,6,7,8,9});
	}
	
	
	public static void main(String[] args) {
		
		Throw01Main main = new Throw01Main();
		
		try {
			main.test();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램 종료");
		
		
	

	}
}
