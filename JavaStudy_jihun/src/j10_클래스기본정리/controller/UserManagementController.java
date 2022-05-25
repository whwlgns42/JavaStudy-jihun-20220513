package j10_클래스기본정리.controller;

import j10_클래스기본정리.repository.User;
import j10_클래스기본정리.service.Usersevice;

public class UserManagementController {
	private Usersevice userSevice;
	
	public UserManagementController() {
		userSevice = new Usersevice();
		
	}
	
	public void createUser() {
		User user = userSevice.insertUser();
		
		System.out.println("[새로 추가된 사용자]");
		System.out.println(user.toString());
	}
	
	
	public void updateUser() {
		
		
	}
	
		
		
}
