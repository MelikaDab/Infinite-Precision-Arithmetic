public class HandleArithmetic {
    public static String solveEquation(String[] nums){
        String multiplier = nums[1];
        DigitList list1 = DigitList.makeList(nums[0]);
        DigitList list2 = DigitList.makeList(nums[2]);

        return switch (multiplier) {
            case "*" -> multiply(list1, list2);
            case "+" -> add(list1, list2);
            case "^" -> exponent(list1, list2);
            default -> "Error";
        };
    }

    private static String multiply(DigitList list1, DigitList list2){
        return "multiply";
    }
    private static String add(DigitList list1, DigitList list2){
        DigitList answer = new DigitList();
        int carry = 0;
        int length = Math.max(list1.getSize(), list2.getSize());
        for(int i = 0; i < length || carry == 1; i++){
            int num = list1.get(i) + list2.get(i) + carry;
            if(num >= 10){
                carry = 1;
                num -= 10;
            } else carry = 0;
            answer.add(num);
        }
        return answer.toString();
    }

    private static String exponent(DigitList list1, DigitList list2){
        return "exponent";
    }


}
