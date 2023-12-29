package service;

import java.util.List;

import entity.EvenementEntity;

public interface EvenementsService {
	
	void deleteEventsById(Integer id) throws RuntimeException;
	
	EvenementEntity getEventById(Integer id) throws RuntimeException;
	
	List<EvenementEntity> getAllEvents();
	
	void saveEvent(EvenementEntity event);
	
	void updateEvent(EvenementEntity event);
	
	/*TODO :  void deleteByIdIn(List<TokenId> id); ajouter une lsite pour effacer plusieurs id*/
}
