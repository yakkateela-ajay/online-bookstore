package controller;

import java.io.IOException;
import java.util.Scanner;

public class LoginOptions {
	Scanner sc = new Scanner(System.in);

	public void loginOptions() throws IOException {
		System.out.println("\t CHOOSE LOGIN TYPE");
		boolean correctOption = false;
		do {
			System.out.println("\t 1.ADMIN LOGIN");
			System.out.println("\t 2.USER LOGIN");
			int loginOption = sc.nextInt();

			switch (loginOption) {
			case 1:
				AdminLogin obj1 = new AdminLogin();
				obj1.checklogin();

				correctOption = false;
				break;
			case 2:
				UserLogin obj2 = new UserLogin();
				obj2.checklogin();

				correctOption = false;
				break;
			default:
				System.out.println("\t CHOOSE CORRECT OPTION");
				correctOption = true;
				break;

			}

		} while (correctOption);

	}
}
