package elp.edu.dbautista.dao;


import elp.edu.dbautista.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface IPersonaDao extends JpaRepository<Persona,Long>  {

}
