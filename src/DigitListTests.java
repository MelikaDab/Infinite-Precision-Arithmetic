import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class DigitListTests {
    @Test
    public void testDigitListAdd() {
        DigitList sample = new DigitList();
        sample.add(3);
        sample.add(4);
        sample.add(5);

        assertEquals(3, sample.getSize());
    }
    
}
