package Methods;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class csvReaderDemo {
    //String filePath = System.getProperty("user.dir") + "\\Files\\Persondetails.csv";

    // C:\\Users\\rbran\\git\\Java_Project\\raBiProject\\Files\\Persondetails.csv
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user inputs
        System.out.print("Enter CSV file path: ");
        String filePath = scanner.nextLine();
        System.out.print("Enter row identifier (e.g., 'Person Groups'): ");
        String targetRowName = scanner.nextLine();
        System.out.print("Enter column name to extract (e.g., 'Person Group Symbol'): ");
        String targetColumnName = scanner.nextLine();

        extractColumnValues(filePath, targetRowName, targetColumnName);
        scanner.close();
    }

    public static void extractColumnValues(String filePath, String targetRowName, String targetColumnName) {
        List<String> columnValues = new ArrayList<>();
        boolean startCollecting = false;
        int targetColumnIndex = -1;

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] nextLine;

            while ((nextLine = reader.readNext()) != null) {
                // Check if this row is the starting row
                if (!startCollecting && nextLine.length > 0 && nextLine[0].trim().equalsIgnoreCase(targetRowName)) {
                    startCollecting = true;

                    // Find the index of the target column
                    for (int i = 0; i < nextLine.length; i++) {
                        if (nextLine[i].trim().equalsIgnoreCase(targetColumnName)) {
                            targetColumnIndex = i;
                            break;
                        }
                    }

                    if (targetColumnIndex == -1) {
                        System.out.println("Column '" + targetColumnName + "' not found.");
                        return;
                    }
                    continue; // Skip the row containing the header itself
                }

                // Collect values from the identified column
                if (startCollecting && nextLine.length > targetColumnIndex) {
                    columnValues.add(nextLine[targetColumnIndex].trim());
                }
            }

            // Print extracted values
            if (columnValues.isEmpty()) {
                System.out.println("No data found under column '" + targetColumnName + "'.");
            } else {
                System.out.println("Values under '" + targetColumnName + "':");
                for (String value : columnValues) {
                    System.out.println(value);
                }
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }
//    public static void main(String[] args) {
//        String filePath = System.getProperty("user.dir") + "\\Files\\Persondetails.csv";
//        String targetValue = "Person Groups"; // Column to search for
////
////        List<String> values = getColumnValues(filePath, columnToFind);
////
////        // Print the values
////       for(String chrs: values){
////           System.out.println(chrs);
////       }
//
//        List<String> columnValues = new ArrayList<>();
//        boolean startCollecting = false;
//
//        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
//            String[] nextLine;
//            int rowNumber = 0;
//
//            while ((nextLine = reader.readNext()) != null) {
//                rowNumber++;
//
//                // Check if we reached the row containing "Person Groups"
//                if (nextLine.length > 0 && nextLine[0].trim().equalsIgnoreCase(targetValue)) {
//                    startCollecting = true;
//                    continue; // Skip the "Person Groups" row itself
//                }
//
//                // If we have found the "Person Groups" row, start collecting values in the same column
//                if (startCollecting && nextLine.length > 0) {
//                    columnValues.add(nextLine[0].trim()); // Collect values from the same column (Column 1)
//                }
//            }
//
//            // Print the collected column values
//            System.out.println("Values under '" + targetValue + "':");
//            for (String value : columnValues) {
//                System.out.println(value);
//            }
//        } catch (IOException | CsvValidationException e) {
//            e.printStackTrace();
//        }
//    }

//    public static List<List<String>> readCSV(String filePath, String columnToFind) {
//        List<List<String>> records = new ArrayList<>();
//
//        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
//            List<String[]> lines = reader.readAll();
//
//            if (lines.isEmpty()) {
//                System.out.println("CSV file is empty!");
//                return records;
//            }
//
//            // Get headers
//            String[] headers = lines.get(3);
//            int columnIndex = -1;
//
//            for (int i = 0; i < headers.length; i++) {
//                if (headers[i].trim().equalsIgnoreCase(columnToFind.trim())) {
//                    columnIndex = i;
//                    break;
//                }
//            }
//
//            if (columnIndex == -1) {
//                System.out.println("Column '" + columnToFind + "' not found.");
//                return records;
//            }
//
//            System.out.println(columnIndex);
//            // Read data from the found column
//            for (int i = 3; i < lines.size(); i++) {
//                if (columnIndex < lines.get(i).length) {
//                    records.add(Arrays.asList(lines.get(i)));
//                }
//            }
//
//        } catch (IOException | CsvException e) {
//            e.printStackTrace();
//        }
//
//        return records;
//    }
//
//    public static List<String> getColumnValues(String filePath, String targetValue) {
//        List<String> result = new ArrayList<>();
//
//        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
//
//            String[] nextLine;
//            int rowNumber = 0;  // Row index (starting from 1 for human-friendly output)
//
//            while ((nextLine = reader.readNext()) != null) {
//                rowNumber++;
//                if (nextLine.length > 0 && nextLine[0].trim().equalsIgnoreCase(targetValue)) {
//                    System.out.println("Row containing '" + targetValue + "' found at row number: " + rowNumber);
//                }
//            }
//            List<String[]> lines = reader.readAll();
//            int targetColumnIndex = -1;
//
//            for (int i = 0; i < lines.size(); i++) {
//                String[] line = lines.get(i);
//
//                System.out.println(line.length);
//                if (i == 0) { // Identify the column index from the first row
//                    for (int j = 4; j < line.length; j++) {
//                        System.out.println(line[j]);
//                        if (line[j].trim().equalsIgnoreCase(targetValue)) {
//                            targetColumnIndex = j;
//                            break;
//                        }
//                    }
//                    if (targetColumnIndex == -1) {
//                        System.out.println("Column '" + targetValue + "' not found!");
//                        return result;
//                    }
//                } else if (targetColumnIndex != -1 && line.length > targetColumnIndex) {
//                    result.add(line[targetColumnIndex]); // Add values under the column
//                }
//            }
//        } catch (IOException | CsvException e) {
//            e.printStackTrace();
//        }
//
//        return result;
//    }
}
