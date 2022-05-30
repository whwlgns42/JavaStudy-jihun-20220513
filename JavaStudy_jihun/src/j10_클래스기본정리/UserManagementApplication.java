package j10_클래스기본정리;

import j10_클래스기본정리.controller.UserManagementController;
import j10_클래스기본정리.service.Usersevice;

public class UserManagementApplication {

	public static void main(String[] args) {
		
		UserManagementController userManagementController 
		= new UserManagementController(new Usersevice());
		userManagementController.createUser();
		userManagementController.createUser();
		userManagementController.createUser();

	}

}
