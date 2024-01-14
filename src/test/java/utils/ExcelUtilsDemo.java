package utils;

public class ExcelUtilsDemo {

    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        ExcelUtils excel = new ExcelUtils(projectPath+"/Excel/testdata.xlsx","login");
         excel.getRowCount();
        String CellData = excel.getStringCellData(0,0);
        System.out.println(CellData);
//        excel.getNumericCellData(1,1);
    }
}
