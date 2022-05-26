package elp.edu.dbautista.service;

import elp.edu.dbautista.entity.Docente;

import java.util.List;

public interface IDocenteService {
    List<Docente> listaProfesor();

    Docente obtenerDocenteBysalario(String salario);

    List<Docente> findAll();
}
