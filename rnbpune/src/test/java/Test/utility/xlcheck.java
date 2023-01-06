package Test.utility;



import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class xlcheck {

	String path;

	public xlcheck(String path) {

		this.path = path;

	}

	public int getrowcount(String sheetName) throws EncryptedDocumentException, IOException {

		File f1 = new File(path);
		Workbook wb = WorkbookFactory.create(f1);
		Sheet sheet = wb.getSheet(sheetName);
		Row rw = sheet.getRow(0);

		int row = sheet.getLastRowNum();

		wb.close();

		return row;

	}

	public int getcoumncount(String sheetName) throws EncryptedDocumentException, IOException {
		File f1 = new File(path);
		Workbook wb = WorkbookFactory.create(f1);
		Sheet sheet = wb.getSheet(sheetName);
		Row rw = sheet.getRow(0);

		int column = rw.getLastCellNum();
		wb.close();

		return column;

	}

	public String getlastCellValue(String sheetName, int row, int cellnum) throws EncryptedDocumentException, IOException {

		File f1 = new File(path);
		Workbook wb = WorkbookFactory.create(f1);
		Sheet sheet = wb.getSheet(sheetName);
		Row rw = sheet.getRow(row);

		Cell cs = rw.getCell(cellnum);

		String data = "";

		try {

			DataFormatter formtae = new DataFormatter();

			data = formtae.formatCellValue(cs);

		} catch (Exception e) {

			data = "";

			// TODO: handle exception
		}

		wb.close();

		return data;

	}
}
