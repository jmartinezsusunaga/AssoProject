package ImplementationService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.EvenementsEntity;
import entity.UtilisateurEntity;
import repository.EvenementsRepository;
import repository.UtilisateurRepository;
import service.UtilisateurService;

@Service
public class EvenementsServiceImpl implements UtilisateurService {

	@Autowired
	private EvenementsRepository evenementsRepository;
	@Override
	public void deleteEventsById(Integer id) {
		
	}

	@Override
	public EvenementsEntity getEventById(Integer id) {
		Optional<EvenementsEntity> eventOpt = evenementsRepository.findById(id);
		if(eventOpt.isPresent())
			return eventOpt.get();
		else
			throw new RuntimeException("");
	}

	@Override
	public List<EvenementsEntity> getAllEvents() {
		  return evenementsRepository.findAll();		
	}

	@Override
	public void saveEvent(EvenementsEntity user) {
	}

	@Override
	public void updateEvent(EvenementsEntity user) {
	}
	

}
