package j20_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> studentMap = new HashMap<Integer, String>();
		
		// 값 추가
		studentMap.put(20, "김준일");
		studentMap.put(10, "김준이");
		studentMap.put(22, "김준삼");
		studentMap.put(33, "김준사");
		studentMap.put(44, "김준오");  //키값은 중복이 될 수 없다. 중복이 될경우 덮어써진다. 키값이 다르면 중복가능 = 맨 마지막 값이 출력. (순서가 없다, 
		
		System.out.println(studentMap);
		
		// key로 value 가져오기
		System.out.println(studentMap.get(10));  // 괄호안에 키값을 입력해 같은 키값의 value값을 가져온다.
		
		// 수정
		studentMap.put(10, "김준육");  // key값을 추가할때 put사용 즉, 값이 없을 경우 추가가 됨.
		
		studentMap.replace(10, "김준칠");  // key값을 수정만 할때는 replace를 사용 (값이 없으면 수정 불가)
		
		studentMap.remove(10); 
		
		Iterator<Integer> iterator = studentMap.keySet().iterator(); // set안에서 iterator사용가능
		
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			String value = studentMap.get(key);
//			if(value.equals("김준오")) {
//				System.out.println(studentMap.get(key));
//			}
			System.out.println(value);
		}
		
		
		
		// 람다식(함수형 프로그래밍)
		studentMap.forEach((k, v) -> {
			System.out.println("key: " + k);
			System.out.println("value: " + v);
		});
		
		System.out.println(studentMap.containsKey(22));  // containskey 값이 들어있는지 없는지 확인하는 것  결과 값은 true, false로 출력됨  true출력
		System.out.println(studentMap.containsValue("김준구")); 
	
	}

}
