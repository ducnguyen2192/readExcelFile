import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ImportFromExcel {
    public ArrayList<Cards> importCard() throws IOException {
        ArrayList<Cards> cards = new ArrayList<>();
        FileInputStream fis = new FileInputStream(new File("C:\\Users\\Thuy Nguyen\\Desktop\\codegym\\Module 2\\readExcelFile\\student.xls"));
        HSSFWorkbook wb = new HSSFWorkbook(fis);
        HSSFSheet sheet = wb.getSheetAt(1);
//        FormulaEvaluator formulaEvaluator = wb.getCreationHelper().createFormulaEvaluator();
        for (Row row : sheet)     //iteration over row using for each loop
        {
            Cards c = new Cards();
            int sheet2CellIndex = 0;
            for (Cell cell : row)    //iteration over cell using for each loop
            {
                switch (sheet2CellIndex) {
                    case 0:
                        c.getStudent().setStudentName(cell.getStringCellValue());
                        break;
                    case 1:
                        c.getStudent().setStudentId(cell.getNumericCellValue());
                        break;
                    case 2:
                        c.getStudent().setStudentAddress(cell.getStringCellValue());
                        break;
                    case 3:
                        c.setCardId(cell.getNumericCellValue());
                        break;
                    case 4:

                    default:
                        break;
                }
                sheet2CellIndex += 1;
            }
            cards.add(c);
        }
        return cards;
    }
}