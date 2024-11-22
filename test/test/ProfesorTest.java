package test;

import main.Profesor;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Franco Paul Cantero
 */
public class ProfesorTest {
    private Profesor profesor;
    
    @Before
    public void setUp() {
        profesor = new Profesor();
        System.out.println("Ejecutando Test Profesor: " + Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    
    @Test
    public void testCalcularCargaHoraria() {
        int resultado = profesor.calcularCargaHoraria(10, 8, 12);
        assertEquals(30, resultado);
    }
    
    @Test
    public void testCaclularAlumnosPorProfesor() {
        int resultado = profesor.calcularAlumnosPorProfesor(32, 4);
        assertEquals(8, resultado);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testCalcularAlumnosConCeroProfesores() {
        profesor.calcularAlumnosPorProfesor(32, 0);
    }
    
    @After
    public void tearDown() {
        System.out.println("Prueba finalizada.");
    }
}
