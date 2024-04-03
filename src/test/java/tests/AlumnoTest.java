package tests;

import clases.Alumno;
import clases.Materia;
import org.junit.Assert;
import org.junit.Test;

    public class AlumnoTest {

        @Test
        public void alumnoAproboMateria(){
            Alumno unAlumno = new Alumno("Nico");

            Materia algoritmos = new Materia("Algoritmos");
            Materia algebra = new Materia("Algebra");
            Materia discreta = new Materia("discreta");

            unAlumno.agregarMateriasAprobadas(algoritmos,discreta);

            Assert.assertTrue("Un alumno aprobo algoritmos", unAlumno.aprobo(algoritmos));
            Assert.assertTrue("Un alumno aprobo discreta", unAlumno.aprobo(discreta));
            Assert.assertFalse("Un alumno no aprobo algebra", unAlumno.aprobo(algebra));
        }

}
