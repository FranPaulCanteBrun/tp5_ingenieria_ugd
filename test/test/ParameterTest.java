package test;

import main.Calculador;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
/**
 *
 * @author Franco Paul Cantero
 */
public class ParameterTest {
    private final double a, b, expected;
    private static Calculador calculador;
    
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
        {8.0, 7.0, 15.0},
        {10.0, -1.0, 9.0},
        {20.0, 10.0, 30.0}
    });
    }
    
    public ParameterTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }
    
    @Test
    public void testSuma() {
        assertEquals(expected, calculador.sumar(a, b), 0.001);
    }
}
