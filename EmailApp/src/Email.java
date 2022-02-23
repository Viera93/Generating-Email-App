
import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String subject;
	private String password;
	private int mailboxCapacity = 500;
	private String email;
	private String newPassword;

	// Constructor
	public Email() {
		this.firstName = askForFirstName();
		this.lastName = askForLastName();
		this.subject = askForSubject();
		this.password = generatePassword(8);

		// Creating an email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + subject + "." + "student.com";

	}

	// Method to generate a random password
	public String generatePassword(int length) {
		String generatedPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789£$&*?+";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int random = (int) (Math.random() * generatedPassword.length());
			password[i] = generatedPassword.charAt(random);
		}
		return new String(password);
	}

	// Method to ask for fist name
	public String askForFirstName() {
		System.out.println("What is your first name?");
		Scanner scan = new Scanner(System.in);
		firstName = scan.nextLine();
		return firstName;
	}

	// Method to ask for last name
	public String askForLastName() {
		System.out.println("What is your last name??");
		Scanner scan = new Scanner(System.in);
		lastName = scan.nextLine();
		return lastName;
	}

	//// Method to ask for subject
	public String askForSubject() {
		System.out.println("What subject would you like to enrol in?");
		Scanner scan = new Scanner(System.in);
		subject = scan.nextLine();
		return subject;
	}

	// Method to change a password
	public void changePassword() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Would you like to change your password?\nPress Y for yes or N for no:");
		newPassword = scan.nextLine();
		if (newPassword.equalsIgnoreCase("Y")) {
			System.out.println("Please enter your new password:");
			newPassword = scan.nextLine();
			System.out.println("Your new password is: " + newPassword);
		} else if (newPassword.equalsIgnoreCase("N")) {
			newPassword = password;
		}

	}

	// Method to set Mailbox capacity
	public void setMailboxChapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}

	// Method to get Mailbox capacity
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	// Method to show all info
	public String showAllInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName + "\nSTUDENT EMAIL: " + email + "\nMAILBOX CAPACITY: "
				+ mailboxCapacity + "MB" + "\nPASSWORD: " + password;
	}

	// Method to show updated info
	public String showUpdatedInfo() {
		return "****UPDATED INFO**** " + "\nDISPLAY NAME: " + firstName + " " + lastName + "\nSTUDENT EMAIL: " + email
				+ "\nMAILBOX CAPACITY: " + mailboxCapacity + "MB" + "\nPASSWORD: " + newPassword;
	}

}
