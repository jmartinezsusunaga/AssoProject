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

import Entity.UtilisateurEntity;
import service.UtilisateurService;

@RestController
@RequestMapping("/test")
public class UserController {

	@Autowired
    private UtilisateurService utilisateurService;

    @GetMapping
    public List<UtilisateurEntity> getAllUser(){
        List<UtilisateurEntity> test = utilisateurService.getAllById();
        System.out.println("users : "+test);
        return test;
    }
    @GetMapping("/{userId}")
    public UtilisateurEntity getUserById(@PathVariable Integer id){
        UtilisateurEntity user = utilisateurService.getById(id); 
        System.out.println("userId : "+id+" : user : "+user);
        return user;
    }

    @PostMapping
    public String saveUser(@RequestBody UtilisateurEntity user){
        utilisateurService.saveById(user); 
        return "user saved successfuly.";
    }

    @PutMapping("/{userId}")
    public String updateUser(@RequestBody UtilisateurEntity user, @PathVariable Integer id){
        utilisateurService.updateById(user, id); getAllUser(); 
        return "user updated successfully.";
    }

    @DeleteMapping("/{userId}")
    public String deleteUseryId(@PathVariable Integer id){
        utilisateurService.deleteById(id);
        return "user deleted successfully.";
    }

}
