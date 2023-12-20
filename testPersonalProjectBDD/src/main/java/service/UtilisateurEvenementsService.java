package service;

import java.util.List;

import Entity.UtilisateurEntity;
import Entity.UtilisateurEvenementsEntity;


public interface UtilisateurEvenementsService {
	
	void save(UtilisateurEvenementsEntity utilisateursEvenements);
	
	List<UtilisateurEvenementsEntity> getAll();
	
}
