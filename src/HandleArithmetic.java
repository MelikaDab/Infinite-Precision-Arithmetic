public class HandleArithmetic {
    private String multiplier;
    private DigitList list1;
    private DigitList list2;

    public  HandleArithmetic(String[] nums){
        multiplier = nums[1];
        list1 = DigitList.makeList(nums[0]);
        list2 = DigitList.makeList(nums[2]);
    }
    public String solveEquation(){
        return switch (multiplier) {
            case "*" -> multiply();
            case "+" -> add();
            case "^" -> exponent();
            default -> "Error";
        };
    }

    private String multiply(){
        return "multiply";
    }
    private String add(){
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

    private String exponent(){
        return "exponent";
    }


}
