package clases;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private String nombre;
    private List<Materia> materiasAprobadas;

    public boolean aprobo (Materia materia){
        return materiasAprobadas.contains(materia);
    }
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.materiasAprobadas = new ArrayList<>();
    }
    public void agregarMateriasAprobadas(Materia ... materias) {
        Collections.addAll(this.materiasAprobadas, materias);
    }
}
