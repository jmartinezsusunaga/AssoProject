package service;

import java.util.List;

import entity.UtilisateurEntity;
import entity.UtilisateurEvenementsEntity;


public interface UtilisateurEvenementsService {
	
	void save(UtilisateurEvenementsEntity utilisateursEvenements);
	
	List<UtilisateurEvenementsEntity> getAll();
	
}
