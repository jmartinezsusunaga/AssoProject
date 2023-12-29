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
	
	/*TODO :  void deleteByIdIn(List<TokenId> id); ajouter une lsite pour effacer plusieurs id*/
}
