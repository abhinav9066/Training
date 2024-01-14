package utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {

    @DataProvider(name="test1data")
    public static Object[][] getData(){
        String excelPath = "C:\\Users\\Abhinav\\IdeaProjects\\Training\\Excel\\testdata.xlsx";
         Object data[][] = testData(excelPath,"login");
         return data;
    }

    @DataProvider(name="test2data")
    public static Object[][] getData2(){
        String excelPath = "C:\\Users\\Abhinav\\IdeaProjects\\Training\\Excel\\testdata.xlsx";
        Object data[][] = testData(excelPath,"login");
        return data;
    }


    @Test(dataProvider = "test2data")
    public void test1(String username , String password){

        System.out.println(username  + " " + password);

    }

//    public static void main(String[] args) {
//
//    }

    public  static Object[][] testData(String excelPath, String sheetName){

        ExcelUtils excel = new ExcelUtils(excelPath,sheetName);
        int rowCount = excel.getRowCount();
        int colCount = excel.getColCount();
        Object data[][] = new Object[rowCount-1][colCount];

        for (int i = 1 ; i <rowCount ; i++){
            for(int j = 0; j < colCount ; j++){
                String CellData =  excel.getStringCellData(i,j);
//                System.out.print(CellData);
                data[i-1][j] = CellData;
//                System.out.print("|");
            }
            System.out.println();
        }
        return data;
    }
}
