
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * A very simple program that writes some data to an Excel file
 * using the Apache POI library.
 * @author www.codejava.net
 *
 */
public class ExportToExcel {

    public void exportToExcel(Library lib) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Java Books");


//        Object[][] bookData = {
//                {"Book Name", "Book Id", "Book Quantity"},
//                {"Head First Java", 1, 60},
//                {"Effective Java", 2, 36},
//                {"Clean Code", 3, 42},
//                {"Thinking in Java", 4, 35},
//        };

        for (Row row : sheet)     //iteration over row using for each loop
        {
            for (Books book : lib.getBookList()) {
                int cellIndex = 0;

                for (Cell cell: row) {
                    switch(cellIndex){
                        case 0:
                            cell.setCellValue(book.getBookName());
                            break;
                        case 1:
                            cell.setCellValue(book.getBookId());
                            break;
                        case 2:
                            cell.setCellValue(book.getBookQuantity());
                        default:
                            break;
                    }
                    cellIndex += 1;
                }
//            for (Object field : aBook) {
//                Cell cell = row.createCell(columnCount++);
//                if (field instanceof String) {
//                    cell.setCellValue((String) field);
//                } else if (field instanceof Integer) {
//                    cell.setCellValue((Integer) field);
//                }
//            }

            }
        }



        try (FileOutputStream outputStream = new FileOutputStream("JavaBooks.xlsx")) {
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

