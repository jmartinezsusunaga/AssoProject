package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.UtilisateurEntity;
import entity.UtilisateurEvenementsEntity;
import entity.UtilisateurEvenementsPKId;

public interface UtilisateurEvenementsRepository extends JpaRepository<UtilisateurEvenementsEntity, UtilisateurEvenementsPKId>{
	
}
