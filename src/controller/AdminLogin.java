package controller;

import java.io.IOException;
import java.util.Scanner;

public class AdminLogin {
	Scanner sc = new Scanner(System.in);

	public void checklogin() throws IOException {
		System.out.println("\t ENTER THE USER NAME");
		System.out.println("");

		String adminUserName = sc.nextLine();
		System.out.println("\t ENTER THE PASSWORD");
		System.out.println("");
		String adminUserpassword = sc.nextLine();

		if (adminUserName.equals("Ajay") && adminUserpassword.equals("Ajay1234@")) {
			System.out.println("\t YOU ARE SUCCESFULLY LOGINED");
			adminLogin();
		} else {
			System.out.println("\t ENTER THE CORRECT USER NAME AND PASSWORD");
			checklogin();
		}

	}

	public void adminLogin() throws IOException {
		// TODO Auto-generated method stub

		Admin operations = new AdminOperation();
		int choice;

		boolean option = false;

		do {
			System.out.println("\t\t----ADMIN OPERATIONS------");
			System.out.println("1. Add books");
			System.out.println("2. update price into book store");
			System.out.println("3. display the books in book store");
			System.out.println("4. generate the excellsheet");
			System.out.println("5. logout");

			System.out.println("enter your  Choice:");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				operations.addBooks();
				adminLogin();
				option = false;
				break;

			case 2:
				operations.updatePrice();
				adminLogin();
				option = false;
				break;

			case 3:

				boolean correctOption = false;
				do {
					System.out.println("1. COMIC BOOKS");
					System.out.println("2. ACTION BOOKS");
					System.out.println("3. TECH BOOKS");
					int option1 = sc.nextInt();

					switch (option1) {
					case 1:
						operations.displayComic();
						correctOption = false;
						break;
					case 2:
						operations.displayAction();
						correctOption = false;
						break;
					case 3:
						operations.displayTech();
						correctOption = false;
						break;
					default:
						System.out.println("\t CHOOSE CORRECT OPTION");
						correctOption = true;
						break;
					}

				} while (correctOption);

				adminLogin();
				option = false;
				break;
			case 4:
				boolean correctOption1 = false;
				do {
					System.out.println("1. COMIC BOOKS");
					System.out.println("2. ACTION BOOKS");
					System.out.println("3. TECH BOOKS");
					int option1 = sc.nextInt();

					switch (option1) {
					case 1:
						operations.generateexcellsheet();
						System.out.println("excel sheet is succesfully generated for comic books");
						correctOption1 = false;
						break;
					case 2:
						operations.generateexcellsheetaction();
						System.out.println("excel sheet is succesfully generated for action books");
						correctOption1 = false;
						break;
					case 3:
						operations.generateexcellsheettech();
						System.out.println("excel sheet is succesfully generated for tech books");
						correctOption1 = false;
						break;
					default:
						System.out.println("\t CHOOSE CORRECT OPTION");
						correctOption1 = true;
						break;
					}

				} while (correctOption1);

				adminLogin();
				option = false;
				break;
			case 5:
				LoginOptions options = new LoginOptions();
				options.loginOptions();
				option = false;
				break;
			default:
				System.out.println("enter valid option:");
				option = true;
				break;
			}
		} while (option);

	}
}
