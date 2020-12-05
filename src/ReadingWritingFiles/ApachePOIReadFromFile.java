package ReadingWritingFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ApachePOIReadFromFile {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub

		File f = new File(
				"C:\\Users\\ezhil\\Desktop\\FrontEndNanodegree\\Udemy - Selenium\\FileOperations\\excel.xlsx");
		FileInputStream fi = new FileInputStream(f);

		Workbook w = WorkbookFactory.create(fi);
		Sheet s = w.getSheetAt(0);

		// enhanced for loop
		// all int values are double
		for (Row row : s) {
			for (Cell c : row) {
				switch (c.getCellType()) { // _NONE, BLANK, BOOLEAN, STRING, ERROR, FORMULA, NUMERIC
				// c.getcell
				case STRING:
					String u = c.getStringCellValue();
					if (u.equals(null)) {
						System.out.println("/t ");
					} else {
						System.out.print(u + " ");
					}
					break;
				case NUMERIC:
					System.out.print(c.getNumericCellValue() + " ");
					break;
				case _NONE:
				case BLANK:
				case BOOLEAN:
				case ERROR:
				case FORMULA:
					System.out.print("No value ");
					break;
				}

			}
			System.out.println();
		}

		fi.close();

	}

}
