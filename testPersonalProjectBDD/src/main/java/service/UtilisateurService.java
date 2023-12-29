package service;

import java.util.List;

import entity.UtilisateurEntity;

public interface UtilisateurService {
	
	void deleteUserById(Integer id) throws RuntimeException;
	
	UtilisateurEntity getUserById(Integer id) throws RuntimeException;
	
	List<UtilisateurEntity> getAllUsers();
	
	void saveUser(UtilisateurEntity user);
	
	void updateUser(UtilisateurEntity user);
	
	/*TODO :  void deleteByIdIn(List<TokenId> id); ajouter une lsite pour effacer plusieurs id*/

}
