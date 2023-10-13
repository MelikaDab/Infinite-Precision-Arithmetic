import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class FileProcessor {

    /**
     * Processes arithmetic expressions line-by-line in the given file.
     *
     * @param filePath Path to a file containing arithmetic expressions.
     */
    public static ArrayList<String[]> processFile(String filePath) {
        File infile = new File(filePath);
        String num1 = "";
        String opperator = "";
        String num2 = "";
        ArrayList<String[]> arr = new ArrayList<>();
        try (Scanner scan = new Scanner(infile)) {
            while (scan.hasNext()) {
                // TODO: Process each line of the input file here.
                String line = scan.nextLine();
                if(line.contains("*") || line.contains("+") || line.contains("^")){
                    line = line.replaceAll("\\s", "");
                    String[] parts = {};
                    if(line.contains("*")){
                        parts = line.split("\\*");
                        opperator = "*";
                    }else if(line.contains("+")){
                        parts = line.split("\\+");
                        opperator = "+";
                    }else if(line.contains("^")){
                        parts = line.split("\\^");
                        opperator = "^";
                    }
                    num1 = parts[0];
                    num2 = parts[1];
                    arr.add(new String[]{num1, opperator, num2});
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + infile.getPath());
        }
        return arr;
    }
}
