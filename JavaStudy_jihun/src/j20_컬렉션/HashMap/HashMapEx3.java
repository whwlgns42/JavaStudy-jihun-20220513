package j20_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

import j20_컬렉션.entity.Student;

public class HashMapEx3 {

	
	/*
	 * 1. 이름이 김재현인 학생의 대학을 서울대학교로 변경하라
	 * 2. 2022003 학번 학생을 2022003, "박호훈", "고려대학교"로 변경
	 * 3. 2022005 학번 학생을 삭제
	 * 4. 2022002 학번 학생정보 출력
	 * 
	 */
	
	
	public static void main(String[] args) {
		HashMap<Integer, Student> students = new HashMap<Integer, Student>();
		students.put(2022001, new Student(2022001, "김준일", "부산대학교"));
		students.put(2022002, new Student(2022002, "권오광", "부경대학교"));
		students.put(2022003, new Student(2022003, "남민아", "동아대학교"));
		students.put(2022004, new Student(2022004, "김재현", "경상대학교"));
		students.put(2022005, new Student(2022005, "송새미", "경북대학교"));
		
		System.out.println(students);
		
		// 1. 방법 1 (Iterator)
		Iterator<Integer> iterator = students.keySet().iterator();  // get값을 가져와야기때문에 iterator을 써서 키갑의 자료형의 integer 사용
		
		while(iterator.hasNext()) {
			Integer key = iterator.next(); // 키 값을 가져옴
			
			Student student = students.get(key);
			if(students.get(key).getName().equals("김재현")) {
				student.setSchoolName("서울대학교");
				break;
			}
		}
		
		// 1. 방법 2 (forEach)
		for(Student student : students.values()) {
			if(student.getName().equals("김재현")) {
				student.setSchoolName("서울대학교");
				break;
			}
		}
		// 1. 방법 3 (람다식)  break를 쓸수가 없다.
		students.forEach((k,v) -> {
			if(v.getName().equals("김재현")) {
				v.setSchoolName("서울대학교");
			}
		});
		
		// 2. 
		students.replace(2022003, new Student(2022003,"박호훈", "고려대학교"));
		
		// 3. 
		students.remove(2022005);
		
		// 4. 
		System.out.println(students.get(2022002)); 
		
		// 5. 전체 출력
		System.out.println("전체 출력" + students);
		
		
	
		

	
}
}
