package j10_클래스기본정리.controller;

import j10_클래스기본정리.repository.User;
import j10_클래스기본정리.service.Usersevice;

public class UserManagementController {
	private Usersevice userSevice; 
	private User[] user;
	
	public UserManagementController() {
		userSevice = new Usersevice();
		user = new User[2];
		
	}
	
	public void createUser() {
		int indexResult = findEmptyInUsers();
		if(indexResult != -1) {
			users[indexResult] = userSevice.insertUser();
			
			
		
		User user = userSevice.insertUser();
		
		System.out.println("[새로 추가된 사용자]");
		System.out.println(user.toString());
	}else {
		System.out.println("더 이상 사용자를 추가할 수 없습니다.")
	};
	
	private int findEmptyInUsers() {
		for(int i = 0; i < users.length; i++) {
			if(users[i] == null) {
				return i;
			}
		}
		return -1;
	}
	
	public void updateUser() {
		
		
	}
	
		
		
}
