package co.edu.recreationmanager.repository;

import co.edu.recreationmanager.entity.TipoDocumentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDocumentoRepository extends JpaRepository<TipoDocumentoEntity, Integer> {
}
