package oops.interfaces;

import java.util.Scanner;

public class UserImpl implements IUser {
	String mUserName;
	String mPassword;

	@Override
	public void register(User user, int index) {
		System.out.println("User " + index + " Registered True");
	}

	@Override
	public void login(String userName, String password) {

		try (Scanner credsInput = new Scanner(System.in)) {
			if (mUserName == null && mPassword == null) {
				System.out.print("\n" + "Enter UserName: ");
				mUserName = credsInput.nextLine();
				System.out.print("Enter Password: ");
				mPassword = credsInput.nextLine();
				if (userName.equalsIgnoreCase(mUserName) && password.equalsIgnoreCase(mPassword)) {
					System.out.println("True");
				} else {
					System.out.println("False");
				}
			} else {
				if (userName.equalsIgnoreCase(mUserName) && password.equalsIgnoreCase(mPassword)) {
					System.out.println("True");
				} else {
					System.out.println("False");
				}
			}
		}
	}
}