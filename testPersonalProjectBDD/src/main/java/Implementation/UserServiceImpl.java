package Implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.UserRepository;
import entity.UserEntityDTO;
import service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Override
	public void deleteById(Integer id) {
	}

	@Override
	public UserEntityDTO getById(Integer id) {
		 Optional<UserEntityDTO> userOpt = userRepository.findById(id);
	        if(userOpt.isPresent())
	            return userOpt.get();
	        else
	            throw new RuntimeException("id not found.");
	}

	@Override
	public List<UserEntityDTO> getAllById() {
		  return userRepository.findAll();		
	}

	@Override
	public void saveById(UserEntityDTO user) {
		UserEntityDTO userDetail = userRepository.save(user);
        System.out.println("user saved to db with userId : " + userDetail.getId_test());
		
	}

	@Override
	public void updateById(UserEntityDTO user, Integer userId) {
		Optional<UserEntityDTO> userDetailOpt = userRepository.findById(userId);
        if(userDetailOpt.isPresent()){
        	UserEntityDTO userDetail = userDetailOpt.get();
            if(user.getTes_name_t() != null || user.getTes_name_t().isEmpty())
                userDetail.setTes_name_t(user.getTes_name_t()); 
            if(user.getTest_date_t() != null)
                userDetail.setTest_date_t(user.getTest_date_t());
            userRepository.save(userDetail);
        }else{
            throw new RuntimeException("user not found.");
        }
		
	}

}