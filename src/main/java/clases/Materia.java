package clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativasMateria;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativasMateria = new ArrayList<>();
    }
    public void agregarCorrelativas(Materia ... correlativas){
        Collections.addAll(this.correlativasMateria , correlativas);
    }
    public boolean puedeSerCursadaPor(Alumno unAlumno){
       return correlativasMateria.stream().allMatch(correlativa -> unAlumno.aprobo(correlativa));
    }

}
