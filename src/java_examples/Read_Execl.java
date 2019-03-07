package java_examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Execl {

	public static void main(String[] args) throws IOException {

		File F = new File("C:\\Users\\User\\Desktop\\Testname.xlsx");
		FileInputStream Fi = new FileInputStream(F);
		XSSFWorkbook wb = new XSSFWorkbook(Fi);
		XSSFSheet st = wb.getSheet("Sheet1");
		int Rowcount = st.getLastRowNum();
		System.out.println("Row Count is : " + Rowcount);
		int Colcount = st.getRow(Rowcount).getLastCellNum();
		System.out.println("Colcount is : " + Colcount);
		String value = st.getRow(3).getCell(2).getStringCellValue();
		System.out.println(value);

		FileOutputStream fo = new FileOutputStream(F);

		st.getRow(2).createCell(3).setCellValue(01-02-2018);
		fo.flush();
		wb.write(fo);

		wb.close();

		fo.close();

	}

}
