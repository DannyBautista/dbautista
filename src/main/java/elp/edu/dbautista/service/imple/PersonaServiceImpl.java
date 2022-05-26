package elp.edu.dbautista.service.imple;


import elp.edu.dbautista.dao.IPersonaDao;
import elp.edu.dbautista.entity.Persona;
import elp.edu.dbautista.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PersonaServiceImpl implements IPersonaService {
    @Autowired
    private IPersonaDao personaDao;

    @Override
    public List<Persona> listaPersonas() {

        List<Persona> personaList = this.personaDao.findAll();

        for (Persona persona: personaList){
            System.out.println(persona.toString());
        }

        return personaList;
    }

    @Override
    public Persona obtenerPersonaByDni(String dni) {
        return null;
    }
}
