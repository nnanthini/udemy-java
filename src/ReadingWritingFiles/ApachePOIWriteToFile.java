package ReadingWritingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePOIWriteToFile {
    /*
     * Java API used to handle xls and xlsx files
     * xls - HSSF api
     * xlsx - XSSF
     * 
     * 
     * 
     * 
     */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		//XSSFSheet sheet = new XSSFSheet(); // private constructor
		XSSFSheet sheet = workbook.createSheet("Sheet 0");
		
		for( int row=0; row<10;row++) {
			Row r = sheet.createRow(row);
			for (int cell=0;cell<5;cell++) {
				Cell c = r.createCell(cell);
				c.setCellValue("xyz");
			}
		}
		
		
		File f = new File("C:\\Users\\ezhil\\Desktop\\FrontEndNanodegree\\Udemy - Selenium\\FileOperations\\excel.xlsx");
		FileOutputStream fs = new FileOutputStream(f);
		workbook.write(fs);
		
		fs.close();
		
		System.out.println("Done writing in excel file");

	}

}
