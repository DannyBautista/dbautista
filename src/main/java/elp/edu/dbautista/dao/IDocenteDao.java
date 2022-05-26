package elp.edu.dbautista.dao;


import elp.edu.dbautista.entity.Docente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDocenteDao extends JpaRepository<Docente, Long> {
}