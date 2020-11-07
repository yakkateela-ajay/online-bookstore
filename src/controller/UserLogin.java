package controller;

import java.io.IOException;
import java.util.Scanner;

import service.TotalAmount;
import service.TotalAmount;

public class UserLogin extends AdminOperation {
	Scanner sc = new Scanner(System.in);

	TotalAmount obj1 = new AdminOperation();

	public void checklogin() throws IOException {
		System.out.println("\t ENTER THE USER NAME");
		System.out.println("");

		String userName = sc.nextLine();
		System.out.println("\t ENTER THE PASSWORD");
		System.out.println("");
		String userpassword = sc.nextLine();

		if (userName.equals("Ajay") && userpassword.equals("Ajay")) {
			System.out.println("\t YOU ARE SUCCESFULLY LOGINED");
			userLogin();
		} else {
			System.out.println("\t ENTER THE CORRECT USER NAME AND PASSWORD");
			checklogin();
		}

	}

	private void userLogin() throws IOException {
		// TODO Auto-generated method stub

		Admin operations2 = new AdminOperation();
		int choice;

		boolean option = false;

		do {
			System.out.println("\t\t----BOOK STORE------");
			System.out.println("1. COMIC BOOKS");
			System.out.println("2. ACTION BOOKS");
			System.out.println("3. TECH BOOKS");
			System.out.println("4. LOGOUT");

			System.out.println("enter your  Choice:");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				operations2.displayComic();
				System.out.println("\n\n");
				System.out.println("choose the book by id which you are willing to buy");

				obj1.amountComic();
				System.out.println("1 confirm order");
				System.out.println("2 cancel order");
				int orderoptions = sc.nextInt();
				if (orderoptions == 1) {
					System.out.println(
							"YOUR ORDER IS SUCCESFULL COMPLETED AND SMS HAD SENT TO REGISTERD MOBILE NUMBER\n\n");
				} else {
					operations2.displayComic();
				}
				userLogin();
				option = false;
				break;
			case 2:
				operations2.displayAction();
				System.out.println("\n\n");
				System.out.println("choose the book by id which you are willing to buy");
				obj1.amountAction();

				System.out.println("1 confirm order");
				System.out.println("2 cancel order");

				int orderoptions1 = sc.nextInt();
				if (orderoptions1 == 1) {
					System.out.println(
							"YOUR ORDER IS SUCCESFULL COMPLETED AND SMS HAD SENT TO REGISTERD MOBILE NUMBER\n\n");

				} else {
					operations2.displayAction();
				}
				userLogin();
				option = false;
				break;
			case 3:
				operations2.displayTech();
				System.out.println("\n\n");
				System.out.println("choose the book by id which you are willing to buy");
				obj1.amountTech();
				;
				System.out.println("1 confirm order");
				System.out.println("2 cancel order");
				int orderoptions2 = sc.nextInt();
				if (orderoptions2 == 1) {
					System.out.println(
							"YOUR ORDER IS SUCCESFULL COMPLETED AND SMS HAD SENT TO REGISTERD MOBILE NUMBER\n\n");
				} else {
					operations2.displayTech();
				}
				userLogin();
				option = false;
				break;

			case 4:
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
