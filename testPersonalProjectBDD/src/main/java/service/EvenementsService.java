package service;

import java.util.List;

import Entity.EvenementsEntity;

public interface EvenementsService {
	
	void deleteEventsById(Integer id);
	
	EvenementsEntity getEventById(Integer id);
	
	List<EvenementsEntity> getAllEvents();
	
	void saveEvent(EvenementsEntity event);
	
	void updateEvent(EvenementsEntity event);
	

}
