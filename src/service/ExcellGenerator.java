package service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;

import model.ActionBooks;
import model.ComicBooks;
import model.TechBooks;

public class ExcellGenerator {
	FileOutputStream out;
	
	public HSSFWorkbook excelGenerate(ComicBooks comicbooks, ArrayList<ComicBooks> bookList)  {
		// TODO Auto-generated method stub
		try{
			String filename = "F:\\comic books.xls";
			HSSFWorkbook workbook=new HSSFWorkbook();
			HSSFSheet sheet =workbook.createSheet("Comic Books"); 
			HSSFRow rowhead=sheet.createRow(0);
			rowhead.createCell(0).setCellValue("Id");
			rowhead.createCell(1).setCellValue("Name");
			rowhead.createCell(2).setCellValue("Author");
			rowhead.createCell(3).setCellValue("Price");

			int i=0;
			for(ComicBooks comicbooks1:bookList){
				int j=i+1;
				HSSFRow row=sheet.createRow(j);
				row.createCell(0).setCellValue(comicbooks1.getId());
				row.createCell(1).setCellValue(comicbooks1.getName());
				row.createCell(2).setCellValue(comicbooks1.getAuthor());
				row.createCell(3).setCellValue(comicbooks1.getPrice());
				i++;
			}
			out=new FileOutputStream(filename);
			workbook.write(out);
			out.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
	}
	////action books
	public HSSFWorkbook excelGenerateaction(ActionBooks actionbooks, ArrayList<ActionBooks> ActionBooks)  {
		// TODO Auto-generated method stub
		try{
			String filename = "F:\\action books.xls";
			HSSFWorkbook workbook=new HSSFWorkbook();
			HSSFSheet sheet =workbook.createSheet("action Books");
			HSSFRow rowhead=sheet.createRow(0);
			rowhead.createCell(0).setCellValue("Id");
			rowhead.createCell(1).setCellValue("Name");
			rowhead.createCell(2).setCellValue("Author");
			rowhead.createCell(3).setCellValue("Price");
			
			int i=0;
			for(ActionBooks actionbooks1:ActionBooks){
				int j=i+1;
				HSSFRow row=sheet.createRow(j);
				row.createCell(0).setCellValue( actionbooks1.getId());
				row.createCell(1).setCellValue( actionbooks1.getName());
				row.createCell(2).setCellValue( actionbooks1.getAuthor());
				row.createCell(3).setCellValue( actionbooks1.getPrice());
				i++;
			}
			out=new FileOutputStream(filename);
			workbook.write(out);
			out.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
	}
	////tech books
	public HSSFWorkbook excelGeneratetech(TechBooks techbooks, ArrayList<TechBooks> techBooks)  {
		// TODO Auto-generated method stub
		try{
			String filename = "F:\\techbooks.xls";
			HSSFWorkbook workbook=new HSSFWorkbook();
			HSSFSheet sheet =workbook.createSheet("tech Books");
			HSSFRow rowhead=sheet.createRow(0);
			rowhead.createCell(0).setCellValue("Id");
			rowhead.createCell(1).setCellValue("Name");
			rowhead.createCell(2).setCellValue("Author");
			rowhead.createCell(3).setCellValue("Price");
			
			int i=0;
			for(TechBooks techbooks1:techBooks){
				int j=i+1;
				HSSFRow row=sheet.createRow(j);
				row.createCell(0).setCellValue(techbooks1.getId());
				row.createCell(1).setCellValue(techbooks1.getName());
				row.createCell(2).setCellValue(techbooks1.getAuthor());
				row.createCell(3).setCellValue(techbooks1.getPrice());
				i++;
			}
			out=new FileOutputStream(filename);
			workbook.write(out);
			out.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
	}
}
