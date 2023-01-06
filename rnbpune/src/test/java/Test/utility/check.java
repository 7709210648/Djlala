package Test.utility;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;

public class check {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		xlcheck x = new xlcheck("C:\\Users\\Dell\\git\\Djlala\\Djlala\\rnbpune\\testdata\\rnb.xlsx");

		int row = x.getrowcount("Sheet1");
		int column = x.getcoumncount("Sheet1");

		System.out.println(row);
		System.out.println(column);
		String[][] data = new String[row][column];

		for (int i = 1; i <= row; i++) {

			for (int j = 0; j < column; j++) {

				data[i - 1][j] = x.getlastCellValue("Sheet1", i, j);

			}
		}

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < column; j++) {

				System.out.println(data[i][j]);

			}
		}

	}

}
