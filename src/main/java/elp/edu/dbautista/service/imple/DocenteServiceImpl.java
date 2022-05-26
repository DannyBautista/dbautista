package elp.edu.dbautista.service.imple;


import elp.edu.dbautista.entity.Docente;
import elp.edu.dbautista.service.IDocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteServiceImpl implements IDocenteService {

    @Autowired
    private IDocenteService profesorDao;

    @Override
    public List<Docente> listaProfesor() {

        List<Docente> docenteList = this.profesorDao.findAll();
        for (Docente docente : docenteList) {
            System.out.println(docente.toString());
        }
        return docenteList;
    }

    @Override
    public Docente obtenerDocenteBysalario(String salario) {
        return null;
    }

    @Override
    public List<Docente> findAll() {
        return null;
    }
}