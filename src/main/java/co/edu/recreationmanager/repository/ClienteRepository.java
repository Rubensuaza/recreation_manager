package co.edu.recreationmanager.repository;

import co.edu.recreationmanager.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer> {
}
