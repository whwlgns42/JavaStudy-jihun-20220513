package j19_제네릭;

import j10_클래스기본정리.repository.User;
import j12_상속.동물.Animal;
import j12_상속.동물.Human;
import j12_상속.동물.Tiger;

public class Controller {
	public Object createUser() {
		return new CMRespDto<String>(1, "회원추가 성공","aaaa,1234"); // 데이터가 정상적이면 1, 비정상이면 -1
	}															//
	
	public Object updateUser() {
		return new CMRespDto<Integer>(1, "회원정보(나이)수정 성공", 29);
	}
	
	// 제네릭의 와일드카드
	public CMRespDto<?> getUser() {
		User user = new User();
		user.setUsercode("2");
		user.setName("jihun");
		user.setPassword("1234");
		user.setName("조지훈");
		user.setEmail("whwlgns42@kakao.com");
		if(user.getUsercode().equals("1")) {
			return new CMRespDto<User>(1, "회원정보 가져오기 성공", user);
		}else {
			return new CMRespDto<String>(-1, "회원정보 가져오기 실패", "usercode = 2");
		}
	}
	
	
	public CMRespDto<? extends Animal> getAnimal(){
		Animal animal = new Animal();
		
		if(animal instanceof Human) {
			return new CMRespDto<Human>(1, "사람입니다.", (Human) animal);
		}else if (animal instanceof Tiger) {
			return new CMRespDto<Tiger>(1, "호랑이입니다.", (Tiger) animal);
		}else {
			return new CMRespDto<>(-1, "찾을 수 없는 동물", animal);  // <>에 빈칸이면 뒤에있는 값을 그대로 들고온다.
			
		}
	}
}
