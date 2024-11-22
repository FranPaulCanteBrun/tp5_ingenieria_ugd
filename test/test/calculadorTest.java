package test;

import main.Calculador;
import org.junit.*;

import static org.junit.Assert.*;


/**
 *
 * @author Franco Paul Cantero
 */
public class calculadorTest {
    private static Calculador calculador;
    
    @BeforeClass
    public static void setUpClass() {
        calculador = new Calculador();
        System.out.println("Bienvenido al sistema de pruebas");
    }
    
    @Before
    public void setUp() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    
    
    @Test
    public void testSuma() {
        assertEquals(5.0, calculador.sumar(2.0, 3.0), 0.001);
    }
    
    @Test
    public void testResta() {
        assertEquals(1.0, calculador.restar(3.0, 2.0), 0.001);
    }
    
    @After
    public void tearDown() {
        System.out.println("Prueba finalizada, campos en 0.");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("La operacion ha finalizado");
    }
    
    
}
