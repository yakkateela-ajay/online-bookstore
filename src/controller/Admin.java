package controller;

import java.io.IOException;

public interface Admin {
	public void addBooks();
	public void updatePrice();
	public void displayComic();
	public void displayAction();
	public void displayTech();
	public void generateexcellsheet() throws IOException;
	public void generateexcellsheetaction() throws IOException;
	public void generateexcellsheettech() throws IOException;
}
