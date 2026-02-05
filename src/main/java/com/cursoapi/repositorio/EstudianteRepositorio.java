package com.cursoapi.repositorio;

import com.cursoapi.model.Estudiante;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstudianteRepositorio {
    private final List<Estudiante> estudiantes = new ArrayList<>(
            List.of(
                    new Estudiante("Max", "Garcia", "14363", 20),
                    new Estudiante("Mariana", "Flores", "12344", 19),
                    new Estudiante ("Sinai", "Modragon", "12345", 19)
            )
    );
    public List<Estudiante> buscarTodos(){
        return estudiantes;
    }

}
