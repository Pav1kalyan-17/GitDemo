package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream(
				"C:\\Users\\phanmala\\eclipse-workspace\\MavenProject\\testData\\DDT.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("sheet1");

		int totalRows = sheet.getLastRowNum();
		int totalCells = sheet.getRow(0).getLastCellNum();

		System.out.println("Total rows--" + totalRows);
		System.out.println("Total Cells---" + totalCells);

		for (int r = 0; r <= totalRows; r++) {
			XSSFRow currentRow = sheet.getRow(r);
			for (int c = 0; c < totalCells; c++) {
				XSSFCell currentCell = currentRow.getCell(c);
				System.out.print(currentCell.toString() + " ");
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();

	}

}
