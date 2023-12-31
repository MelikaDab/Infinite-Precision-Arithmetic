import java.util.LinkedList;

public class HandleArithmetic {
    public static DigitList solveEquation(String[] nums) {
        String multiplier = nums[1];
        DigitList list1 = DigitList.makeList(nums[0]);
        DigitList list2 = DigitList.makeList(nums[2]);

        return switch (multiplier) {
            case "*" -> multiply(list1, list2);
            case "+" -> add(list1, list2);
            case "^" -> exponent(list1, Integer.parseInt(list2.toString()));
            default -> null;
        };
    }

    public static DigitList multiply(DigitList list1, DigitList list2) {
        DigitList answer = new DigitList();
        DigitList finalAnswer = DigitList.makeList("");
        int carry = 0;

        for (int i = 0; i < list1.getSize(); i++) {

            for (int j = 0; j < list2.getSize() || carry > 0; j++) {
                int product = list1.get(i) * list2.get(j) + carry;
                int num = product % 10;
                carry = product / 10;
                answer.add(num);

            }

            finalAnswer = HandleArithmetic.add(finalAnswer, answer);
            //TODO: below - probably not the best memory efficient way to have an empty list?? but deleteNodes method was giving me errors and i am sleepy
            answer = new DigitList();
            for (int zeros = 0; zeros <= i; zeros++) {
                answer.add(0);
            }

        }

        return finalAnswer;
    }

    //TODO: changed return type to list because I wanted to use it in my multiply method, lmk what u think
    public static DigitList add(DigitList list1, DigitList list2) {
        DigitList answer = new DigitList();
        int carry = 0;
        int length = Math.max(list1.getSize(), list2.getSize());
        for (int i = 0; i < length || carry == 1; i++) {
            int num = list1.get(i) + list2.get(i) + carry;
            if (num >= 10) {
                carry = 1;
                num -= 10;
            } else carry = 0;
            answer.add(num);
        }
        //return answer.toString();
        return answer;
    }

    public static DigitList exponent(DigitList list1, int n) {
        DigitList finalList = new DigitList();
        if (n == 0) {
            finalList.add(1);
            return finalList;
        } else if (n % 2 == 0) {
            return exponent(multiply(list1, list1), n/2);
        } else { //else if (n % 2 == 1) {
            return multiply(list1, exponent(multiply(list1, list1), (n-1)/2));
        }
    }






}
