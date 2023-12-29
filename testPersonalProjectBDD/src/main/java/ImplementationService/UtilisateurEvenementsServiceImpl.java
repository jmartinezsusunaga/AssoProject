package ImplementationService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.EvenementEntity;
import entity.UtilisateurEntity;
import entity.UtilisateurEvenementsEntity;
import entity.UtilisateurEvenementsPKId;
import repository.UtilisateurEvenementsRepository;
import repository.UtilisateurRepository;
import service.UtilisateurEvenementsService;
import service.UtilisateurService;

@Service
@SpringBootApplication
@RestController
@RequestMapping("/UtilisateurEvenementsEntity")
public class UtilisateurEvenementsServiceImpl implements UtilisateurEvenementsService {

	@Autowired
	private UtilisateurEvenementsRepository utilisateurEventsRepository;

	@Override
	@GetMapping
	public void save(UtilisateurEvenementsEntity userEvents) {
		UtilisateurEvenementsEntity userEventsdetail = utilisateurEventsRepository.save(userEvents);
	}
	
	@Override
	@GetMapping
	public List<UtilisateurEvenementsEntity> getAll(){
		return utilisateurEventsRepository.findAll();
	}
	
	@Override
	@GetMapping
	public void deleteUtEvById(UtilisateurEvenementsPKId id) throws RuntimeException{
		if(id != null)
			utilisateurEventsRepository.deleteById(id);
		else
			throw new RuntimeException("Id is null.");
	}
	
	@Override
	@GetMapping
	public UtilisateurEvenementsEntity getUtEvById(UtilisateurEvenementsPKId id) throws RuntimeException{
		if(id != null) {
			Optional<UtilisateurEvenementsEntity> userEventOpt = utilisateurEventsRepository.findById(id);
			if(userEventOpt.isPresent())
				return userEventOpt.get();
			else
				throw new RuntimeException("id not found.");
			}else
				throw new RuntimeException("id is null.");
	}
	
	@Override
	@GetMapping
	public void updateTuEv(UtilisateurEvenementsEntity utiEven) {
		UtilisateurEvenementsEntity utiEventEntity = getUtEvById(utiEven.getId());
		if(utiEventEntity != null) {
			if(utiEven.getHeure_passage_ue() != null)
				utiEventEntity.setHeure_passage_ue(utiEven.getHeure_passage_ue());
			
			if(utiEven.getVisuel_artiste_ue() != null )
				utiEventEntity.setVisuel_artiste_ue(utiEven.getVisuel_artiste_ue());
		}
	}
	

}
