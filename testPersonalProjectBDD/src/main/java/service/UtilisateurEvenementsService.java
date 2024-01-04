package service;

import java.util.List;

import entity.UtilisateurEntity;
import entity.UtilisateurEvenementsEntity;
import entity.UtilisateurEvenementsPKId;


public interface UtilisateurEvenementsService {
	
	void save(UtilisateurEvenementsEntity utilisateursEvenements);
	
	List<UtilisateurEvenementsEntity> getAll();
	
	void deleteUtEvById(UtilisateurEvenementsPKId id) throws RuntimeException;
	
	UtilisateurEvenementsEntity getUtEvById(UtilisateurEvenementsPKId id) throws RuntimeException;

	void updateTuEv(UtilisateurEvenementsEntity user);
	
	/*TODO :  void deleteByIdIn(List<TokenId> id); ajouter une liste pour effacer plusieurs id*/
	/*TODO : au niveau de la recherche je vais avoir besoin de la liste d"événements liés à un utilisateur
	 * https://www.baeldung.com/spring-jpa-embedded-method-parameters*/
}
