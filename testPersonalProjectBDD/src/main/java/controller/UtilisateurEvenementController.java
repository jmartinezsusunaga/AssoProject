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

import entity.UtilisateurEvenementsEntity;
import entity.UtilisateurEvenementsPKId;
import service.UtilisateurEvenementsService;

@RestController
@RequestMapping("/Utilisateur_evenemments")
public class UtilisateurEvenementController {

	@Autowired
    private UtilisateurEvenementsService utlisateurEvenementService;

    @GetMapping
    public List<UtilisateurEvenementsEntity> getAllUtiEvent(){
        List<UtilisateurEvenementsEntity> utiEvents = utlisateurEvenementService.getAll();
        return utiEvents;
    }
    @GetMapping("/{id}")
    public UtilisateurEvenementsEntity getUserById(@PathVariable UtilisateurEvenementsPKId id){
        UtilisateurEvenementsEntity utiEvent = utlisateurEvenementService.getUtEvById(id);
        return utiEvent;
    }

    @PostMapping
    public String saveUser(@RequestBody UtilisateurEvenementsEntity utiEvent){
        utlisateurEvenementService.save(utiEvent); 
        return "user event  saved successfuly.";
    }

    @PutMapping("/{id}")
    public String updateUser(@RequestBody UtilisateurEvenementsEntity utiEvent){
        utlisateurEvenementService.updateTuEv(utiEvent);
        return "user event  updated successfully.";
    }

    @DeleteMapping("/{id}")
    public String deleteUseryId(@PathVariable UtilisateurEvenementsPKId id){
        utlisateurEvenementService.deleteUtEvById(id);
        return "user event deleted successfully.";
    }

}
