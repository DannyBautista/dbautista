package elp.edu.dbautista.service;

import elp.edu.dbautista.entity.Persona;

import java.util.List;

public interface IPersonaService {
    List<Persona> listaPersonas();

    //Buscar persona por su dni
    Persona obtenerPersonaByDni(String dni);
}

