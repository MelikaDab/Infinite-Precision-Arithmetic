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

    // TODO: do we need to test the printlist method? :'(
    @Test
    public void testDigitListMakeList() {
        DigitList sample = new DigitList();
        sample.add(5);
        sample.add(8);
        sample.add(9);

        assertEquals(sample, DigitList.makeList("985"));


    }




    
}
