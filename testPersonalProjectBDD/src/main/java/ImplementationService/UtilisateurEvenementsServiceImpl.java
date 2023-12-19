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

import entity.UtilisateurEntity;
import entity.UtilisateurEvenementsEntity;
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
		System.out.print("User saved event id: " + userEventsdetail.getId_evenement_ue() + "user id : " + userEventsdetail.getId_utilisateur_ue());
	}
	@Override
	@GetMapping
	public List<UtilisateurEvenementsEntity> getAll(){
		return utilisateurEventsRepository.findAll();
	}
	
	
}
