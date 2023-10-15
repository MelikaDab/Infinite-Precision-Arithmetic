import javax.swing.*;
import java.util.ArrayList;

public class BigNumArithmetic {

    /**
     * The entry point of the program.
     * @param args Command line arguments. Should have exactly one argument: a file name.
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "Expected exactly 1 argument: a file name.");
        }
        String filePath = args[0];
        ArrayList<String[]> calculationsList = FileProcessor.processFile(filePath);
        String[] firstCalc = calculationsList.get(0);
        System.out.println(firstCalc[0]+" + "+firstCalc[2]+" = "+HandleArithmetic.solveEquation(firstCalc));
        //System.out.println(firstCalc[0]+firstCalc[1]+firstCalc[2]);
        //DigitList firstList = DigitList.makeList("123456789");
        //firstList.printList();
        //System.out.println("\nsize: " + firstList.getSize());
    }
}

