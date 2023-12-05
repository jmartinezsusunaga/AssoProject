package service;

import java.util.List;

import entity.UtilisateurEntityDTO;

public interface UserService {
	
	void deleteById(Integer id);
	
	UtilisateurEntityDTO getById(Integer id);
	
	List<UtilisateurEntityDTO> getAllById();
	
	void saveById(UtilisateurEntityDTO user);
	
	void updateById(UtilisateurEntityDTO user, Integer userId);
	

}
