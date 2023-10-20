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

        for (String[] calc : calculationsList) {
            String result = (HandleArithmetic.solveEquation(calc)).toString();


            if (calculationsList.indexOf(calc) == calculationsList.size() - 1) {
                System.out.print(calc[0] + " " + calc[1] + " " + calc[2] + " = " + result);

            }
            else {
                System.out.print(calc[0] + " " + calc[1] + " " + calc[2] + " = " + result + "\n");
            }


        }
        //String[] firstCalc = calculationsList.get(0);
//
//
//        DigitList first = DigitList.makeList("99");
//        DigitList second = DigitList.makeList("99");
//        DigitList answer = HandleArithmetic.multiply(first, second);
//        System.out.println(answer.toString());
//
//        DigitList efirst = DigitList.makeList("12");
//        int n = 2;
//        DigitList eanswer = HandleArithmetic.exponent(efirst, n);
//        System.out.println(eanswer.toString());
        //System.out.println(firstCalc[0]+firstCalc[1]+firstCalc[2])

    }
}

