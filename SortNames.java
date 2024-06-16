import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortNames {

    public static void main(String[] args) {
        String inputFilePath = "input.txt";
        String outputFilePath = "sorted_names.txt";
        
        List<String> names = readNamesFromFile(inputFilePath);
        
        if (names != null) {
            Collections.sort(names);
            writeNamesToFile(names, outputFilePath);
            System.out.println("Names have been sorted and written to " + outputFilePath);
        } else {
            System.out.println("An error occurred while reading the file.");
        }
    }

    private static List<String> readNamesFromFile(String filePath) {
        List<String> names = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                names.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        
        return names;
    }

    private static void writeNamesToFile(List<String> names, String filePath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (String name : names) {
                bw.write(name);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

