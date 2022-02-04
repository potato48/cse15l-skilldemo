import static org.junit.Assert.*;
import org.junit.*;

public class FeatureTester {
    @Test
    public void testDoMath() {
        assertEquals(4, Feature.doMath(2));
    }
}
