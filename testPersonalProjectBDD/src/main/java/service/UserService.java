package service;

import java.util.List;

import entity.UserEntityDTO;

public interface UserService {
	
	void deleteById(Integer id);
	
	UserEntityDTO getById(Integer id);
	
	List<UserEntityDTO> getAllById();
	
	void saveById(UserEntityDTO user);
	
	void updateById(UserEntityDTO user, Integer userId);
	

}
