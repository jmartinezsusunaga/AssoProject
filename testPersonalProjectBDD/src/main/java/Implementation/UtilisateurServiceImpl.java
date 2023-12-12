package Implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.UtilisateurEntityDTO;
import repository.UserRepository;
import service.UserService;

@Service
public class UtilisateurServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Override
	public void deleteById(Integer id) {
	}

	@Override
	public UtilisateurEntityDTO getById(Integer id) {
		 Optional<UtilisateurEntityDTO> userOpt = userRepository.findById(id);
	        if(userOpt.isPresent())
	            return userOpt.get();
	        else
	            throw new RuntimeException("id not found.");
	}

	@Override
	public List<UtilisateurEntityDTO> getAllById() {
		  return userRepository.findAll();		
	}

	@Override
	public void saveById(UtilisateurEntityDTO user) {
		UtilisateurEntityDTO userDetail = userRepository.save(user);
        System.out.println("user saved to db with userId : " + userDetail.getId_uti());
		
	}

	@Override
	public void updateById(UtilisateurEntityDTO user, Integer userId) {
		Optional<UtilisateurEntityDTO> userDetailOpt = userRepository.findById(userId);
        if(userDetailOpt.isPresent()){
        	UtilisateurEntityDTO userDetail = userDetailOpt.get();
            if(user.getNom_uti() != null || user.getNom_uti().isEmpty())
                userDetail.setNom_uti(user.getNom_uti()); 
            if(user.getDate_naissance_uti() != null)
                userDetail.setDate_naissance_uti(user.getDate_naissance_uti());
            userRepository.save(userDetail);
        }else{
            throw new RuntimeException("user not found.");
        }
		
	}

}