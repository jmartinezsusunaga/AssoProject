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
	public void deleteUserById(Integer id) throws RuntimeException{
		 if(id != null)
			 utilisateurRepository.deleteById(id);
		 else
				throw new RuntimeException("Id is null.");
	}

	/*cette méthode est utilisée pour en plus de chercher l'utilisateur, connaitre l'existance de l'user*/
	@Override
	public UtilisateurEntity getUserById(Integer id) throws RuntimeException {
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
		UtilisateurEntity userEntity = getUserById(user.getId_uti());
		 if(userEntity != null) {
			 UtilisateurEntity userDetail = utilisateurRepository.save(user);
		        System.out.println("user saved to db with userId : " + userDetail.getId_uti());			 
		 }
	}

	/*TODO : utiliser une class dédié aux if's et ajouter les changements*/
	@Override
	public void updateUser(UtilisateurEntity user) {
		UtilisateurEntity userEntity = getUserById(user.getId_uti());
        if(userEntity != null){
        	
            if(user.getPrenom_uti() != null || user.getPrenom_uti().isEmpty())
            	userEntity.setPrenom_uti(user.getPrenom_uti()); 
            
            if(user.getDate_naissance_uti() != null) //TODO : la date de naissance doit-elle changer ?
            	userEntity.setDate_naissance_uti(user.getDate_naissance_uti());
            
            if(user.getMdp_uti() != null || user.getMdp_uti().isEmpty())
            	userEntity.setMdp_uti(user.getMdp_uti());
            
            if(user.getNom_uti() != null || user.getNom_uti().isEmpty())
            	userEntity.setNom_uti(user.getNom_uti());
            
            if(user.getMail_uti() != null || user.getMail_uti().isEmpty())
            	userEntity.setMail_uti(user.getMail_uti());
            
            if(user.getDroits_uti() != null || user.getDroits_uti().isEmpty())
            	userEntity.setDroits_uti(user.getDroits_uti());

            if(user.getPersonnalite_juridique_uti() != null || user.getPersonnalite_juridique_uti().isEmpty())
            	userEntity.setPersonnalite_juridique_uti(user.getPersonnalite_juridique_uti());
            
            if(user.getNom_artistique_uti() != null || user.getNom_artistique_uti().isEmpty())
            	userEntity.setNom_artistique_uti(user.getNom_artistique_uti());
            
            if(user.getPhoto_uti() != null || user.getPhoto_uti().isEmpty())
            	userEntity.setPhoto_uti(user.getPhoto_uti());
            
            if(user.getType_poste_association_uti() != null || user.getType_poste_association_uti().isEmpty())
            	userEntity.setType_poste_association_uti(user.getType_poste_association_uti());
            
            if(user.getBio_art() != null || user.getBio_art().isEmpty())
            	userEntity.setBio_art(user.getBio_art());
            
            if(user.getLien_instagram_art() != null || user.getLien_instagram_art().isEmpty())
            	userEntity.setLien_instagram_art(user.getLien_instagram_art());
            
            if(user.getLien_soundCloud_art() != null || user.getLien_soundCloud_art().isEmpty())
            	userEntity.setLien_soundCloud_art(user.getLien_soundCloud_art());
            
            if(user.getLien_facebook_art() != null || user.getLien_facebook_art().isEmpty())
            	userEntity.setLien_facebook_art(user.getLien_facebook_art());
            
            if(user.getLien_spotify_art() != null || user.getLien_spotify_art().isEmpty())
            	userEntity.setLien_spotify_art(user.getLien_spotify_art());
            
            if(user.getLien_youtube_art() != null || user.getLien_youtube_art().isEmpty())
            	userEntity.setLien_youtube_art(user.getLien_youtube_art());
            
            if(user.getLogo_ass_art() != null || user.getLogo_ass_art().isEmpty())
            	userEntity.setLogo_ass_art(user.getLogo_ass_art());
            
            utilisateurRepository.save(userEntity);
        }
		
	}
	

}
