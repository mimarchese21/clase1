package tests;

import clases.Alumno;
import clases.Inscripcion;
import clases.Materia;
import org.junit.Assert;
import org.junit.Test;

public class InscripcionTest {

    @Test
    public void inscripcionAprobada(){
        Alumno unAlumno = new Alumno("Nico");

        Materia diseno = new Materia("Diseno");
        Materia discreta = new Materia("Discreta");
        Materia opertaivos = new Materia("Operativos");

        opertaivos.agregarCorrelativas();
        diseno.agregarCorrelativas(discreta);

        unAlumno.agregarMateriasAprobadas(discreta);

        Inscripcion inscripcion = new Inscripcion(unAlumno);
        inscripcion.agregarMaterias(diseno);
        inscripcion.agregarMaterias(opertaivos);

        Assert.assertTrue("La inscripcion fue aceptada", inscripcion.aprobada());
        Assert.assertFalse("La inscripcion fue rechazada", inscripcion.aprobada());
    }
}
