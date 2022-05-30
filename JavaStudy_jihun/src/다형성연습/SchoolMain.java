package 다형성연습;

public class SchoolMain {

	public static void main(String[] args) {
		School school = new School();
		Student student = new Student();
		Teacher teacher = new Teacher();
		
		school.introduce();
		teacher.introduce();
		student.introduce();
	}

}
