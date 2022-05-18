package j05_조건;

public class SwitchCase {

	public static void main(String[] args) {
		int num = 29;
		char c = 'c';
		String str = "조지훈1";
		
		// 자료형이 같아야 한다.
		// switch 뒤에는 수식도 넣을 수 있다.
		// 중간 중간에 브레이크를 걸어준다 그렇지 않으면 가운데것이 출력될때 밑에있는 마지막껏도 같이 한꺼번에 출력이된다.
		// 중괄호가 없어서 구분이 없다 그래서 첫번째가 출력이 되어도 밑에껏도 전체가 다 출력이된다.
		// default는 제일 마지막에 써야한다.
		// default는 else와 같다고 생각하면된다. 원하는 값이 없으면 default가 출력이 된다.
		// default를 넣게되면 마지막 케이스에도 break를 걸어주어야한다. 그렇지 않으면 마지막 케이스를 출력할때 default까지 같이 
		// 한꺼번에 출력이 되기때문이다.
		// 
		
		switch(num / 10){
			case 1:
				System.out.println("case 1");
				break;
			case 2:
				System.out.println("case 2");
				break;
			case 3:
				System.out.println("case 3");
				break;
			default:
				System.out.println("찾을 수 없음");
		}
		
		switch(c){
			case 'a':
				System.out.println("case a");
				break;
			case 'b':
				System.out.println("case b");
				break;
			case 'c':
				System.out.println("case c");	
				break;
			default:
				System.out.println("찾을 수 없음");
		}
		
		switch(str){
			case "조지훈":
				System.out.println("case 조지훈");
				break;
			case "조지훈1":
				System.out.println("case 조지훈1");
				break;
			case "조지훈2":
				System.out.println("case 조지훈2");	
				break;
			default:
				System.out.println("찾을 수 없음");
			}
		
	}

}
