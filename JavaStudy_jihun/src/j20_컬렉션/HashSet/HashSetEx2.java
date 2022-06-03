package j20_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

import j20_컬렉션.entity.Student;


public class HashSetEx2 {

	public static void main(String[] args) {
		
		/*
		 * HashSet<Student>
		 * 
		 * 2022001, 김준일, "부산대학교"
		 * 2022001, 김준이, "부경대학교"
		 * 
		 * 2022002인 코드를 가진 학생을 조회
		 * 
		 * 2022001인 코드를 가진 학생을 삭제
		 */
		
		HashSet<Student> studentSet = new HashSet<Student>();
		
		studentSet.add(new Student(2022001,"김준일","부산대학교"));
		studentSet.add(new Student(2022001,"김준이","부산대학교"));
		
		Iterator<Student> iterator = studentSet.iterator();
		
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getSutdentCode() == 2022002) {
				System.out.println(student);
			}
		}
		
		iterator = studentSet.iterator();
		
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getSutdentCode() == 2022001) {
				studentSet.remove(student);
			}
		}
		System.out.println(studentSet);
	}
	


}
