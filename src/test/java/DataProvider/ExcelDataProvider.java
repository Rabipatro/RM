package DataProvider;

import java.io.File;
import java.io.FileInputStream;



import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
    XSSFWorkbook wb;
	public  ExcelDataProvider()
	{
		File src=new File("./Applicatrion Test Data/AppData.xlsx");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			
			wb=new XSSFWorkbook(fis);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
		public String getData(int sheetindex,int row,int col)
		{
			String data=wb.getSheetAt(sheetindex).getRow(row).getCell(col).getStringCellValue();
			return data;
					
		}
		
		public String getData(String sheetname,int row,int col)
		{
			String data=wb.getSheet(sheetname).getRow(row).getCell(col).getStringCellValue();
			return data;
					
		}
		
		
	
	

}
