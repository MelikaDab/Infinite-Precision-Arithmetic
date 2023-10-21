import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class Tests {


    @Test void testDigitListAdd() {

        DigitList sample = new DigitList();
        sample.add(3);
        sample.add(4);
        sample.add(5);

        assertEquals(3, sample.getSize());
    }

    @Test
    public void testDigitListGet() {

        DigitList sample = new DigitList();
        sample.add(5);
        sample.add(8);
        sample.add(9);

        assertEquals(5, sample.get(0));
        assertEquals(8, sample.get(1));
        assertEquals(9, sample.get(2));
    }

    @Test
    public void testDigitListMakeList() {
        DigitList sample = DigitList.makeList("985");
        DigitList answer = new DigitList();
        answer.add(5);
        answer.add(8);
        answer.add(9);

        assertTrue(DigitList.equals(answer, sample));

    }

   @Test
    public void testAdd() {
        DigitList num1 = DigitList.makeList("567");
        DigitList num2 = DigitList.makeList("6772");

        DigitList answer = DigitList.makeList("7339");
        assertTrue(DigitList.equals(answer, HandleArithmetic.add(num1, num2)));

   }

    @Test
    public void testExponent() {
        DigitList list1 = new DigitList();
        DigitList answer = new DigitList();
        list1.add(1);
        list1.add(0);

        answer.add(1);
        answer.add(0);
        answer.add(0);
        answer.add(0);

        assertTrue(DigitList.equals(answer, HandleArithmetic.exponent(list1, 3)));
    }

    @Test
    public void testMultiply() {
        DigitList num1 = DigitList.makeList("567");
        DigitList num2 = DigitList.makeList("6772");

        DigitList answer = DigitList.makeList("3839724");
        assertTrue(DigitList.equals(answer, HandleArithmetic.multiply(num1, num2)));
    }
    
}
