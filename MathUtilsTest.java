import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    private MathUtils mathUtils;

    @BeforeEach
    public void setUp() {
        mathUtils = new MathUtils();
    }

    @Test
    public void testAdd() {
        assertEquals(5, mathUtils.add(2, 3));
        assertEquals(-1, mathUtils.add(-3, 2));
        assertEquals(0, mathUtils.add(0, 0));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, mathUtils.subtract(3, 2));
        assertEquals(-5, mathUtils.subtract(-3, 2));
        assertEquals(0, mathUtils.subtract(3, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, mathUtils.multiply(2, 3));
        assertEquals(-6, mathUtils.multiply(-2, 3));
        assertEquals(0, mathUtils.multiply(0, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, mathUtils.divide(6, 3));
        assertEquals(-2.0, mathUtils.divide(-6, 3));
        assertEquals(-1.0, mathUtils.divide(6, 0));
        assertEquals(0.0, mathUtils.divide(0, 5));
    }
}
