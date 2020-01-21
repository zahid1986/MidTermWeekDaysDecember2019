package excelreadandwrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFile {


 private static final String FILE_NAME = System.getProperty("user.dir") + "/src/Data/Zahid86.xlsx";

 public static void main(String[] args) {


  // System.out.println(System.getProperty("user.dir"));
  XSSFWorkbook workbook = new XSSFWorkbook();
  XSSFSheet sheet = workbook.createSheet("Datatypes");

  Object[][] datatypes = {
          { "Name",     "CoreModule", "JavaModule",  "Status " },
          { "Quazi",    "BoothCamp",  "BoothCapm" ,   "Done " },
          { "Rezowan",  "BoothCamp",  "BoothCapm" ,   "Done " },
          { "Shuvro",   "BoothCamp",  "BoothCapm" ,   "Done " },
          { "Kollol",   "BoothCamp",  "BoothCapm" ,   "Done " },

  };


  int rowNum = 0;
  System.out.println("Creating excel");



  for (Object[] datatype : datatypes) {

   Row row = sheet.createRow(rowNum++);
   int colNum = 0;

   for (Object field : datatype) {

    Cell cell = row.createCell(colNum++);

    if (field instanceof String) {
     cell.setCellValue((String) field);
    } else if (field instanceof Integer) {
     cell.setCellValue((Integer) field);
    }

   }

  }

  try {
   FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
   workbook.write(outputStream);
   workbook.close();
  } catch (FileNotFoundException e) {
   e.printStackTrace();
  } catch (IOException e) {
   e.printStackTrace();
  }
  System.out.println("Done");
 }










}





