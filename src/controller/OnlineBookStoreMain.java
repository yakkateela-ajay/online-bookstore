package controller;

import java.io.IOException;

import model.ComicBooks;

public class OnlineBookStoreMain {

	public static void main(String[] args) throws IOException {

		System.out.println("\t------------------------------------------------------------------------");
		System.out.println("\t\t\tWELCOME TO ONLINE BOOK STORE");
		System.out.println("\t------------------------------------------------------------------------");
		LoginOptions options = new LoginOptions();
		options.loginOptions();
	}

}
