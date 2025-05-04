package extraConcept;


import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class readCSVClass {
    //C://Users//rbran//git//Java_Project//my_Project//Files//Persondetails.csv
    public static void main(String[] args) {
        String filePath = "//C://Users//rbran//git//Java_Project//my_Project//Files//Persondetails.csv"; // Update with actual file path
        String columnToFind = "Person Groups"; // Column to search for

        List<List<String>> result = readCSV(filePath, columnToFind);

        if (result.isEmpty()) {
            System.out.println("Column not found or no data available.");
        } else {
            for (List<String> row : result) {
                System.out.println(row);
            }
        }
    }

    public static List<List<String>> readCSV(String filePath, String columnToFind) {
        List<List<String>> records = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> lines = reader.readAll();

            if (lines.isEmpty()) {
                System.out.println("CSV file is empty!");
                return records;
            }

            // Get headers
            String[] headers = lines.get(0);
            int columnIndex = -1;

            for (int i = 0; i < headers.length; i++) {
                if (headers[i].trim().equalsIgnoreCase(columnToFind.trim())) {
                    columnIndex = i;
                    break;
                }
            }

            if (columnIndex == -1) {
                System.out.println("Column '" + columnToFind + "' not found.");
                return records;
            }

            // Read data from the found column
            for (int i = 1; i < lines.size(); i++) {
                if (columnIndex < lines.get(i).length) {
                    records.add(Arrays.asList(lines.get(i)));
                }
            }

        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }

        return records;
    }
}
