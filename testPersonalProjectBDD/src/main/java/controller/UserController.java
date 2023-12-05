package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.UtilisateurEntityDTO;
import service.UserService;

@RestController
@RequestMapping("/test")
public class UserController {

	@Autowired
    private UserService userService;

    @GetMapping
    public List<UtilisateurEntityDTO> getAllUser(){
        List<UtilisateurEntityDTO> test = userService.getAllById();
        System.out.println("users : "+test);
        return test;
    }
    @GetMapping("/{userId}")
    public UtilisateurEntityDTO getUserById(@PathVariable Integer id){
        UtilisateurEntityDTO user = userService.getById(id); 
        System.out.println("userId : "+id+" : user : "+user);
        return user;
    }

    @PostMapping
    public String saveUser(@RequestBody UtilisateurEntityDTO user){
        userService.saveById(user); 
        return "user saved successfuly.";
    }

    @PutMapping("/{userId}")
    public String updateUser(@RequestBody UtilisateurEntityDTO user, @PathVariable Integer id){
        userService.updateById(user, id); getAllUser(); 
        return "user updated successfully.";
    }

    @DeleteMapping("/{userId}")
    public String deleteUseryId(@PathVariable Integer id){
        userService.deleteById(id);
        return "user deleted successfully.";
    }

}
