package ImplementationService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.UtilisateurEntity;
import repository.UtilisateurRepository;
import service.UtilisateurService;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

	@Autowired
	private UtilisateurRepository utilisateurRepository;
	@Override
	public void deleteUserById(Integer id) {
		 UtilisateurEntity userOpt = getUserById(id);
		 if(userOpt != null)
			 utilisateurRepository.deleteById(id);
	}

	/*cette méthode est utilisée pour en plus de chercher l'utilisateur, connaitre l'existance de l'user*/
	@Override
	public UtilisateurEntity getUserById(Integer id) {
		 Optional<UtilisateurEntity> userOpt = utilisateurRepository.findById(id);
	        if(userOpt.isPresent())
	            return userOpt.get();
	        else
	            throw new RuntimeException("id not found.");
	}

	@Override
	public List<UtilisateurEntity> getAllUsers() {
		  return utilisateurRepository.findAll();		
	}

	@Override
	public void saveUser(UtilisateurEntity user) {
		UtilisateurEntity userOpt = getUserById(user.getId_uti());
		 if(userOpt != null) {
			 UtilisateurEntity userDetail = utilisateurRepository.save(user);
		        System.out.println("user saved to db with userId : " + userDetail.getId_uti());			 
		 }
	}

	/*TODO : utiliser une class dédié aux if's et ajouter les changements*/
	@Override
	public void updateUser(UtilisateurEntity user) {
		UtilisateurEntity userOpt = getUserById(user.getId_uti());
        if(userOpt != null){
        	
            if(user.getPrenom_uti() != null || user.getPrenom_uti().isEmpty())
            	userOpt.setPrenom_uti(user.getPrenom_uti()); 
            
            if(user.getDate_naissance_uti() != null) //TODO : la date de naissance doit-elle changer ?
            	userOpt.setDate_naissance_uti(user.getDate_naissance_uti());
            
            if(user.getMdp_uti() != null || user.getMdp_uti().isEmpty())
            	userOpt.setMdp_uti(user.getMdp_uti());
            
            if(user.getNom_uti() != null || user.getNom_uti().isEmpty())
            	userOpt.setNom_uti(user.getNom_uti());
            
            if(user.getMail_uti() != null || user.getMail_uti().isEmpty())
            	userOpt.setMail_uti(user.getMail_uti());
            
            if(user.getDroits_uti() != null || user.getDroits_uti().isEmpty())
            	userOpt.setDroits_uti(user.getDroits_uti());

            if(user.getPersonnalite_juridique_uti() != null || user.getPersonnalite_juridique_uti().isEmpty())
            	userOpt.setPersonnalite_juridique_uti(user.getPersonnalite_juridique_uti());
            
            if(user.getNom_artistique_uti() != null || user.getNom_artistique_uti().isEmpty())
            	userOpt.setNom_artistique_uti(user.getNom_artistique_uti());
            
            if(user.getPhoto_uti() != null || user.getPhoto_uti().isEmpty())
            	userOpt.setPhoto_uti(user.getPhoto_uti());
            
            if(user.getType_poste_association_uti() != null || user.getType_poste_association_uti().isEmpty())
            	userOpt.setType_poste_association_uti(user.getType_poste_association_uti());
            
            if(user.getBio_art() != null || user.getBio_art().isEmpty())
            	userOpt.setBio_art(user.getBio_art());
            
            if(user.getLien_instagram_art() != null || user.getLien_instagram_art().isEmpty())
            	userOpt.setLien_instagram_art(user.getLien_instagram_art());
            
            if(user.getLien_soundCloud_art() != null || user.getLien_soundCloud_art().isEmpty())
            	userOpt.setLien_soundCloud_art(user.getLien_soundCloud_art());
            
            if(user.getLien_facebook_art() != null || user.getLien_facebook_art().isEmpty())
            	userOpt.setLien_facebook_art(user.getLien_facebook_art());
            
            if(user.getLien_spotify_art() != null || user.getLien_spotify_art().isEmpty())
            	userOpt.setLien_spotify_art(user.getLien_spotify_art());
            
            if(user.getLien_youtube_art() != null || user.getLien_youtube_art().isEmpty())
            	userOpt.setLien_youtube_art(user.getLien_youtube_art());
            
            if(user.getLogo_ass_art() != null || user.getLogo_ass_art().isEmpty())
            	userOpt.setLogo_ass_art(user.getLogo_ass_art());
            
            utilisateurRepository.save(userOpt);
        }
		
	}
	

}
