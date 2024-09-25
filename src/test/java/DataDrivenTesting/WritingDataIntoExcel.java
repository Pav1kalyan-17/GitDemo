package DataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream("C:\\Users\\phanmala\\eclipse-workspace\\MavenProject\\testData\\myfile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Data");
		
		XSSFRow row1 = sheet.createRow(0);
		      row1.createCell(0).setCellValue("Java");
		      row1.createCell(1).setCellValue(123);
		      row1.createCell(2).setCellValue("pavan");
		XSSFRow row2 = sheet.createRow(1);
		      row2.createCell(0).setCellValue("C#");
		      row2.createCell(1).setCellValue(321);
		      row2.createCell(2).setCellValue("Kalyan");
		XSSFRow row3 = sheet.createRow(2);
		      row3.createCell(0).setCellValue("Python");
		      row3.createCell(1).setCellValue(567);
		      row3.createCell(2).setCellValue("hanmala");
		      
		 workbook.write(file);
		 workbook.close();
		 file.close();
		 
		 System.out.println("File is created......");
		 
}
}
