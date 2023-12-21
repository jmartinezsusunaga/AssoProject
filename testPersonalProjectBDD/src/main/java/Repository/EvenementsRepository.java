package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.EvenementEntity;
import entity.UtilisateurEntity;

public interface EvenementsRepository extends JpaRepository<EvenementEntity, Integer>{

}
