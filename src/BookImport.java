import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class BookImport {
    public ArrayList<Books> importBook() throws IOException {
        ArrayList<Books> books = new ArrayList<>();
        FileInputStream fis = new FileInputStream(new File("C:\\Users\\Thuy Nguyen\\Desktop\\codegym\\Module 2\\readExcelFile\\student.xls"));
        HSSFWorkbook wb = new HSSFWorkbook(fis);
        HSSFSheet sheet = wb.getSheetAt(0);
//        FormulaEvaluator formulaEvaluator = wb.getCreationHelper().createFormulaEvaluator();
        for (Row row : sheet)     //iteration over row using for each loop
        {
            Books b = new Books();
            int cellIndex = 0;
            if(row.getRowNum() == 0){
                continue;
            } else {
                for (Cell cell : row)    //iteration over cell using for each loop
                {
                    switch (cellIndex) {
                        case 0:
                            b.setBookName(cell.getStringCellValue());
                            break;
                        case 1:
                            b.setBookId(cell.getNumericCellValue());
                            break;
                        case 2:
                            b.setBookQuantity(cell.getNumericCellValue());
                            break;
                        default:
                            break;
                    }
                    cellIndex += 1;
                }
            }
            books.add(b);
        }
        return books;
    }
}