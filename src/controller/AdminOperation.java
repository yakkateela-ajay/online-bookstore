package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import model.ComicBooks;
import model.ActionBooks;
import model.TechBooks;
import service.ExcellGenerator;
import service.TotalAmount;

public class AdminOperation implements Admin, TotalAmount {

	Scanner sc1 = new Scanner(System.in);

	ComicBooks comicbooks;

	///// Arraylist for comic books
	static ArrayList<ComicBooks> bookList = new ArrayList<ComicBooks>() {
		{
			add(new ComicBooks(1, "Watchmen", "Alan Moore", 400));
			add(new ComicBooks(2, "The Walking Dead", "Robert Kirkman & Tony Moore", 300));
			add(new ComicBooks(3, "The Boy, the Mole, the Fox and the Horse", "Charlie Mackesy", 500));

		}
	};

	public static ArrayList<ComicBooks> getBookComic() {
		return bookList;
	}
	ActionBooks actionbooks;
	///// Arraylist for action books
	static ArrayList<ActionBooks> bookAction = new ArrayList<ActionBooks>() {
		{

			add(new ActionBooks(1, "Life of Pi", "Yann Martel", 400));
			add(new ActionBooks(2, "The Three Musketeers", "Alexandre Dumas", 300));
			add(new ActionBooks(3, "The Call of the Wild", "Charlie Mackesy", 200));

		}
	};
	TechBooks techbooks;
	///// Arraylist for tech books
	static ArrayList<TechBooks> techBooks = new ArrayList<TechBooks>() {
		{

			add(new TechBooks(1, "C language", "Ashok K kamthane", 350));
			add(new TechBooks(2, "java programming", "Alexandre Dumas", 300));
			add(new TechBooks(3, "Python", "Charlie Mackesy", 370));

		}
	};

	public void generateexcellsheet() throws IOException {
		ExcellGenerator excel = new ExcellGenerator();
		HSSFWorkbook hwb = excel.excelGenerate(comicbooks, bookList);
	}
	public void generateexcellsheetaction() throws IOException {
		ExcellGenerator excel = new ExcellGenerator();
		HSSFWorkbook hwb = excel.excelGenerateaction(actionbooks, bookAction);
	}
	public void generateexcellsheettech() throws IOException {
		ExcellGenerator excel = new ExcellGenerator();
		HSSFWorkbook hwb = excel.excelGeneratetech(techbooks, techBooks);
	}

	////// adding books/////////////
	@Override
	public void addBooks() {

		boolean correctOption = false;
		do {
			System.out.println("\t 1. ADD COMIC BOOKS");
			System.out.println("\t 2. ADD ACTION BOOKS");
			System.out.println("\t 2. ADD TECH BOOKS");
			int loginOption = sc1.nextInt();

			switch (loginOption) {
			case 1:
				int id;
				String name;
				String author;
				double price;

				System.out.println("Enter book id:");
				id = sc1.nextInt();
				System.out.println("book name : ");
				name = sc1.next();
				System.out.println("book author : ");
				sc1.nextLine();
				author = sc1.nextLine();
				System.out.println("book price : ");
				price = sc1.nextDouble();
				System.out
						.println("[id=" + id + "\tname=" + name + ",\t Author=" + author + ", \tprice=" + price + "]");
				System.out.println("new book is addes succesfully");
				ComicBooks book = new ComicBooks(id, name, author, price);
				bookList.add(book);
				correctOption = false;
				break;
			case 2:
				int id1;
				String name1;
				String author1;
				double price1;

				System.out.println("Enter book id:");
				id1 = sc1.nextInt();
				System.out.println("book name : ");
				name1 = sc1.next();
				System.out.println("book author : ");
				sc1.nextLine();
				author1 = sc1.nextLine();
				System.out.println("book price : ");
				price1 = sc1.nextDouble();
				System.out.println(
						"[id=" + id1 + "\tname=" + name1 + ",\t authour=" + author1 + ", \tprice=" + price1 + "]");
				System.out.println("new book is addes succesfully");
				ActionBooks book1 = new ActionBooks(id1, name1, author1, price1);
				bookAction.add(book1);
				correctOption = false;
				break;
			case 3:
				int id2;
				String name2;
				String author2;
				double price2;

				System.out.println("Enter book id:");
				id2 = sc1.nextInt();
				System.out.println("book name : ");
				name2 = sc1.next();
				System.out.println("book author : ");
				sc1.nextLine();
				author2 = sc1.nextLine();
				System.out.println("book price : ");
				price2 = sc1.nextDouble();
				System.out.println(
						"[id=" + id2 + "\tname=" + name2 + ",\t Author=" + author2 + ", \tprice=" + price2 + "]");
				System.out.println("new book is addes succesfully");
				TechBooks tech = new TechBooks(id2, name2, author2, price2);
				techBooks.add(tech);
				correctOption = false;
				break;
			default:
				System.out.println("\t CHOOSE CORRECT OPTION");
				correctOption = true;
				break;
			}

		} while (correctOption);

	}

	////// update methods////////////////
	@Override
	public void updatePrice() {
		// TODO Auto-generated method stub
		boolean option = false;

		do {

			System.out.println("1. COMIC BOOKS");
			System.out.println("2. ACTION BOOKS");
			System.out.println("3. TECH BOOKS");
			System.out.println("enter your  Choice:");
			int choice = sc1.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enetr id");
				int id = sc1.nextInt();
				System.out.println("enetr new price");
				int newPrice = sc1.nextInt();
				bookList.get(id - 1).setPrice(newPrice);
				System.out.println("MODIFIED  PRICE OF --> " + bookList.get(id - 1).getName() + " IS  -->"
						+ bookList.get(id - 1).getPrice());
				option = false;
				break;
			case 2:
				System.out.println("enetr id");
				int id1 = sc1.nextInt();
				System.out.println("enetr new price");
				int newPrice1 = sc1.nextInt();
				bookAction.get(id1 - 1).setPrice(newPrice1);
				System.out.println("MODIFIED  PRICE OF --> " + bookAction.get(id1 - 1).getName() + " IS  -->"
						+ bookAction.get(id1 - 1).getPrice());
				option = false;
				break;
			case 3:
				System.out.println("enetr id");
				int id2 = sc1.nextInt();
				System.out.println("enetr new price");
				int newPrice2 = sc1.nextInt();
				techBooks.get(id2 - 1).setPrice(newPrice2);
				System.out.println("MODIFIED  PRICE OF  --> " + techBooks.get(id2 - 1).getName() + " IS  -->"
						+ techBooks.get(id2 - 1).getPrice());
				option = false;
				break;
			default:
				System.out.println("enter valid option:");
				option = true;
				break;
			}
		} while (option);

	}

	////// displaying methods////////////////
	@Override
	public void displayComic() {
		// TODO Auto-generated method stub
		for (ComicBooks str : bookList) {
			System.out.println("[id=" + str.getId() + "\tname=" + str.getName() + "\t author=" + str.getAuthor()
					+ "\t price=" + str.getPrice() + "]");
		}
	}

	@Override
	public void displayAction() {
		// TODO Auto-generated method stub
		for (ActionBooks str : bookAction) {
			System.out.println("[id=" + str.getId() + "\tname=" + str.getName() + "\t author=" + str.getAuthor()
					+ "\t price=" + str.getPrice() + " ]");
		}
	}

	@Override
	public void displayTech() {
		// TODO Auto-generated method stub
		for (TechBooks str : techBooks) {
			System.out.println("[id=" + str.getId() + "\tname=" + str.getName() + "\t author=" + str.getAuthor()
					+ "\t price=" + str.getPrice() + " ]");
		}
	}

	////// caluculating the book price
	public void amountComic() {
		System.out.println("enetr id");
		int id = sc1.nextInt();
		System.out.println("ORDERED BOOK NAME IS --> " + bookList.get(id - 1).getName() + " AND PRICE IS  -->"
				+ bookList.get(id - 1).getPrice());
		System.out.println("\n");
	}

	public void amountAction() {
		System.out.println("enetr id");
		int id = sc1.nextInt();
		System.out.println("ORDERED BOOK NAME IS --> " + bookAction.get(id - 1).getName() + " AND PRICE IS  -->"
				+ bookAction.get(id - 1).getPrice());
		System.out.println("\n");
	}

	public void amountTech() {
		System.out.println("enetr id");
		int id = sc1.nextInt();
		System.out.println("ORDERED BOOK NAME IS --> " + techBooks.get(id - 1).getName() + " AND PRICE IS  -->"
				+ techBooks.get(id - 1).getPrice());
		System.out.println("\n");
	}
}
