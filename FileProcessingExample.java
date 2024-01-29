import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileProcessingExample {

    public static void main(String[] args) {
        String inputFilePath = "C:/Users/Vishv.Patel/Desktop/Sample/sampledata.csv";
        String outputFilePath = "C:/Users/Vishv.Patel/Desktop/Sample/sampledata1.csv";

        try {
            // Read the content of the file
            List<String> lines = readFromFile(inputFilePath);

            // Remove the last 100 rows
            List<String> modifiedLines = removeLastRows(lines, 100);

            // Write the modified content to a new file
            writeToFile(modifiedLines, outputFilePath);

            System.out.println("File processing completed successfully.");
        } catch (IOException e) {
            System.err.println("Error processing the file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static List<String> readFromFile(String filePath) throws IOException {
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }

        return lines;
    }

    private static List<String> removeLastRows(List<String> lines, int rowsToRemove) {
        int totalLines = lines.size();
        int startIndex = Math.max(0, totalLines - rowsToRemove);

        return lines.subList(0, startIndex);
    }

    private static void writeToFile(List<String> lines, String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
}

