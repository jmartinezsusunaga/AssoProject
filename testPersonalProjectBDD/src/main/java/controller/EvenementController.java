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

import entity.EvenementEntity;
import service.EvenementsService;

@RestController
@RequestMapping("/evenements")
public class EvenementController {

	@Autowired
    private EvenementsService evenementService;

    @GetMapping
    public List<EvenementEntity> getAllEvents(){
        List<EvenementEntity> events = evenementService.getAllEvents();
        return events;
    }
    @GetMapping("/{id}") /*Il faut ajouter */
    public EvenementEntity getEventById(@PathVariable Integer id){
        EvenementEntity event = evenementService.getEventById(id); 
        System.out.println("userId : "+id+" : user : "+event);
        return event;
    }

    @PostMapping()
    public String saveUser(@RequestBody EvenementEntity event){
        evenementService.saveEvent(event); 
        return "event saved successfuly.";
    }

    @PutMapping("/{id}") /*Le mapping est correct ?*/
    public String updateEvent(@RequestBody EvenementEntity event, @PathVariable Integer id){ /*TODO: pas besoin d'id - PRECISER LE NOM DE L'ATTRIBUE */
        evenementService.updateEvent(event);
        return "user updated successfully.";
    }

    @DeleteMapping("/{id}")
    public String deleteEventsById(@PathVariable Integer id){
        evenementService.deleteEventsById(id);
        return "event deleted successfully.";
    }
/*TODO : tester avec postMan
 * https://howtodoinjava.com/spring-mvc/controller-getmapping-postmapping/*/
}
