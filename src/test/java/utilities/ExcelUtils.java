package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtils 
{
	public FileInputStream file;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;

	String ExcelDataFile;
	String cellData;
	
	public ExcelUtils(String path)
	{
		this.ExcelDataFile=path;
	}
	
	public static Object[][] readDataFromExcel(String filePath, String sheetName) throws IOException {
		DataFormatter format = new DataFormatter();
        FileInputStream file = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet(sheetName);

        int rowCount = sheet.getLastRowNum();
        int colCount = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowCount][colCount];
//        System.out.println("no of rows : " + rowCount);
//        System.out.println("no of cols : " + colCount);
        
        for (int i = 1; i <= rowCount; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < colCount; j++) {
                data[i - 1][j] = row.getCell(j)!= null? format.formatCellValue(row.getCell(j)): "";
            }
        }
        workbook.close();
        file.close();

        return data;
    }
	
	public String calculateRowNumber(int totalRows, String offset) {
        // Add your logic here to calculate the row number dynamically
        // For example, you could use the offset to determine the row number
        return offset;
    }
}