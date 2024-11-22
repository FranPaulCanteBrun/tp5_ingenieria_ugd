package test;

import org.junit.Test;

/**
 *
 * @author Franco Paul Cantero
 */
public class DivisionTest {
    @Test(expected = ArithmeticException.class)
    public void testDivisionCero() {
        int a = 10, b = 0;
        int res = a / b;
    }
}
