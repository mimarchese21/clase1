package tests;

import clases.Alumno;
import clases.Materia;
import org.junit.Assert;
import org.junit.Test;

public class MateriaTest {

    @Test
    public void materiaPuedeSerCursada(){
        Materia unaMateria = new Materia("Diseno");

        Materia discreta = new Materia("Discreta");
        Materia algoritmos = new Materia("Algoritmos");
        Materia sistemasYorganizaciones = new Materia("Sistemas y organizaciones");


        unaMateria.agregarCorrelativas(discreta, algoritmos, sistemasYorganizaciones);

        Alumno unAlumno = new Alumno("Nico");
        unAlumno.agregarMateriasAprobadas(discreta, algoritmos, sistemasYorganizaciones);


        Assert.assertTrue("Nico deberia poder cursar Diseno", unaMateria.puedeSerCursadaPor(unAlumno));
        Assert.assertFalse("Nico no debería poder cursar Diseno", unaMateria.puedeSerCursadaPor(unAlumno));

    }
}
