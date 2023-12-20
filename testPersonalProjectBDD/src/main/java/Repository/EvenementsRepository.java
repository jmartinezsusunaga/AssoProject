package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.EvenementsEntity;
import Entity.UtilisateurEntity;

public interface EvenementsRepository extends JpaRepository<EvenementsEntity, Integer>{

}
