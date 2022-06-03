package j20_컬렉션.ArrayList;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<>();
		ArrayList<String> nameList2 = new ArrayList<>();
		
		
		// 리스트에 값 추가 -> add() 
		nameList.add("조지훈");
		nameList.add("곽나경");
		nameList.add("김서홍");
		nameList.add("최보성");
		nameList.add("박준형");
		nameList.add("강주현");
		nameList.add("유재원");
		
		
		
		// 리스트 중간에 값 삽입 -> add()
		nameList.add(0, "이동영");  // 출력 : [이동영, 조지훈, 곽나경, 김서홍, 최보성, 박준형, 강주현, 유재원]
		
		// 리스트 내의 해당 인덱스 값 수정
		nameList.set(1, "정유진");  // 출력 : [이동영, 정유진, 곽나경, 김서홍, 최보성, 박준형, 강주현, 유재원]
		
		
		// 리스트 내에서 인덱스로 값 삭제
		nameList.remove(3);
		
		// 리스트 내에서 값을 바로 삭제
		nameList.remove("강주현");
		
		
		// 리스트에서 리스트로 값 옯기기(깊 복사)
		nameList2.addAll(nameList); 
		
		
		// 리스트 내의 모든 값 확인 -> toString()
		System.out.println(nameList);   // 출력 : [조지훈, 곽나경, 김서홍, 최보성, 박준형, 강주현, 유재원]
		
		
		
		// 리스트에서 값 가져오기 -> get(인덱스 번호)
		System.out.println(nameList.get(3));  // 3번 인덱스 값을 가져와라
		
		
		// 리스트내에서 원하는 값이 있는지 확인
		System.out.println(nameList.contains("조지훈"));  // 조지훈 이라는 값이 있으면 true, 그렇지 않으면 false 출력
		System.out.println(nameList.contains("이동영"));  // 이동영 이라는 값이 있으면 출력
		
		
		// 리스내에 값이 하나라도 있으면 비우기
		if(!nameList.isEmpty()) {   // isEmpty : 비어있으면 true값을 가짐
			nameList.clear();
		}
		
		System.out.println(nameList); //  출력 : []
		System.out.println(nameList2);
		
		
		Object[] objs =  nameList2.toArray();
		for(Object obj : objs) {
			System.out.println((String) obj);
		}
	}
}
