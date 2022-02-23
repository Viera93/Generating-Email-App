
public class EmailApp {

	public static void main(String[] args) {

		Email email1 = new Email();
		System.out.println(email1.showAllInfo());
		email1.changePassword();
		System.out.println(email1.showUpdatedInfo());

	}

}
