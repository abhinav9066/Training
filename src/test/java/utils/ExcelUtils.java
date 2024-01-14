package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelUtils {
    static  String projectPath;
    static XSSFWorkbook workbook;
    static XSSFSheet  sheet;

    public ExcelUtils(String excelPath , String sheetName){
        try{
        workbook = new XSSFWorkbook(excelPath);
        sheet = workbook.getSheet(sheetName);

        }
        catch(Exception exp){
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
        }

    }

    public static void main(String[] args) {
        getRowCount();
        getStringCellData(1,0);
        getNumericCellData(1,1);
    }
    public static int getRowCount(){
        int rowCount = 0;
        try{
            rowCount = sheet.getPhysicalNumberOfRows();
//            System.out.println("no of rows count "+rowCount);

        }
       catch(Exception exp){
           System.out.println(exp.getMessage());
           System.out.println(exp.getCause());
       }
          return rowCount;
    }

    public static int getColCount(){

        int  colCount = 0;
        try{
            colCount = sheet.getRow(0).getPhysicalNumberOfCells();
            System.out.println("no of Col count "+colCount);
        }
        catch(Exception exp){
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
        }
        return colCount;
    }

    public static  String getStringCellData(int rowNum , int columnNumber){

        String RowData = null;
        try{

            RowData = sheet.getRow(rowNum).getCell(columnNumber).getStringCellValue();
//            System.out.println(RowData);

        }
        catch(Exception exp){
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
        }
        return RowData;
    }

    public static  void getNumericCellData(int rowNum , int columnNumber){
        try{
            double value = sheet.getRow(rowNum).getCell(columnNumber).getNumericCellValue();
//            System.out.println(value);
        }
        catch(Exception exp){
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
        }

    }

}
