package j16_인터페이스_활용.controller;

import j10_클래스기본정리.service.Usersevice;
import j16_인터페이스_활용.service.UserService;

public class ApiController {
	
	private final Usersevice usersevice; // 종속에 대한 주입?
	
	public ApiController(Usersevice usersevice) {
		this.usersevice = usersevice;
		
	}
	
	public void addUser() {
		System.out.println("사용자 추가");
		usersevice.create();
	}
	
	public void getUser() {
		System.out.println("사용자 정보 가져오기");
		usersevice.read();
		
	}
	
	public void modifiUser() {
		System.out.println("사용자 정보 수정");
		usersevice.modifiUser();
		
	}
	
	public void removeUser() {
		System.out.println("사용자 삭제");
		userService.removeUser();
		
	}
}
