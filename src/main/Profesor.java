package main;

/**
 *
 * @author Franco Paul Cantero
 */
public class Profesor {
    public int calcularCargaHoraria(int materia1, int materia2, int materia3) {
        int sumaCargaHoraria = materia1 + materia2 + materia3;
        return sumaCargaHoraria;
    }
    
    public int calcularAlumnosPorProfesor(int alumnos, int profesores) {
        if (profesores == 0) throw new ArithmeticException("No se pueden asignar alumnos a 0 profesores");
        return alumnos / profesores;
    }
}
