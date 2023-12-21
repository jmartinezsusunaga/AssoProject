package ImplementationService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.EvenementEntity;
import entity.UtilisateurEntity;
import repository.EvenementsRepository;
import service.EvenementsService;

@Service
public class EvenementsServiceImpl implements EvenementsService {

	@Autowired
	private EvenementsRepository evenementsRepository;

	@Override
	public void deleteEventsById(Integer id) throws RuntimeException {
		if(id != null)
			evenementsRepository.deleteById(id);
		else
			throw new RuntimeException("Id is null.");
	}

	@Override
	public EvenementEntity getEventById(Integer id) throws RuntimeException {
		if(id != null) {
		Optional<EvenementEntity> eventOpt = evenementsRepository.findById(id);
		if(eventOpt.isPresent())
			return eventOpt.get();
		else
			throw new RuntimeException("id not found.");
		}else
			throw new RuntimeException("id is null.");
	}

	@Override
	public List<EvenementEntity> getAllEvents() {
		return evenementsRepository.findAll();
	}

	@Override
	public void saveEvent(EvenementEntity event) {
		EvenementEntity eventEntity = getEventById(event.getId_ev());
		if(eventEntity != null) {
			EvenementEntity eventDetail = evenementsRepository.save(eventEntity);
		}
	}

	@Override
	public void updateEvent(EvenementEntity event) {
		EvenementEntity eventEntity = getEventById(event.getId_ev());
		if(eventEntity != null) {
			if(event.getNom_ev() != null || event.getNom_ev().isEmpty())
            	eventEntity.setNom_ev(event.getNom_ev()); 
            
            if(event.getLieu_ev() != null || event.getNom_ev().isEmpty()) 
            	eventEntity.setLieu_ev(event.getLieu_ev());
            
            if(event.getDate_ev() != null)
            	eventEntity.setDate_ev(event.getDate_ev());
            
            if(event.getCapacite_event_ev() != null)
            	eventEntity.setCapacite_event_ev(event.getCapacite_event_ev());
            
            if(event.getVisuel_facebook_ev() != null || event.getVisuel_facebook_ev().isEmpty())
            	eventEntity.setVisuel_facebook_ev(event.getVisuel_facebook_ev());
            
            if(event.getVisuel_insta_poste_ev() != null || event.getVisuel_insta_poste_ev().isEmpty())
            	eventEntity.setVisuel_insta_poste_ev(event.getVisuel_insta_poste_ev());

            if(event.getVisuel_insta_story_ev() != null || event.getVisuel_insta_story_ev().isEmpty())
            	eventEntity.setVisuel_insta_story_ev(event.getVisuel_insta_story_ev());
		}
		evenementsRepository.save(eventEntity);
	}
	

}
