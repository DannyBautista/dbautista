package elp.edu.dbautista.dao;


import elp.edu.dbautista.entity.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDireccionDao extends JpaRepository<Direccion, Long> {
}
