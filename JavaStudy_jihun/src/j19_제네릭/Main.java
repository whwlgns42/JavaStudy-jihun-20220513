package j19_제네릭;

public class Main {

	public static void main(String[] args) {
		Controller controller = new Controller();
		System.out.println(controller.createUser());
		System.out.println(controller.updateUser());
		controller.getAnimal().getData().move();
	}

}
