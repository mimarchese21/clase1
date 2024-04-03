package clases;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
    private List<Materia> materias;
    private Alumno alumno;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materias = new ArrayList<>();
    }
    public void agregarMaterias(Materia materia){
        materias.add(materia);
    }
    public boolean aprobada(){
        return materias.stream().allMatch(materia -> materia.puedeSerCursadaPor(alumno));
    }


}
