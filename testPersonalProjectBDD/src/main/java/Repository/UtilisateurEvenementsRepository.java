package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.UtilisateurEntity;
import Entity.UtilisateurEvenementsEntity;
import Entity.UtilisateurEvenementsPKId;

public interface UtilisateurEvenementsRepository extends JpaRepository<UtilisateurEvenementsEntity, UtilisateurEvenementsPKId>{
	
}
