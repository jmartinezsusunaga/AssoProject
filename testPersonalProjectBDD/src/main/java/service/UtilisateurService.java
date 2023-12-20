package service;

import java.util.List;

import Entity.UtilisateurEntity;

public interface UtilisateurService {
	
	void deleteUserById(Integer id);
	
	UtilisateurEntity getUserById(Integer id);
	
	List<UtilisateurEntity> getAllUsers();
	
	void saveUser(UtilisateurEntity user);
	
	void updateUser(UtilisateurEntity user);
	

}
