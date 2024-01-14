import utils.*;
public class Excelout {

    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        ExcelUtils excel = new ExcelUtils(projectPath+"/Excel/testdata.xlsx","login");
        excel.getStringCellData(0, 0);
    }

}
