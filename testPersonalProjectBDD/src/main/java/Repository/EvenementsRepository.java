package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.EvenementsEntity;
import entity.UtilisateurEntity;

public interface EvenementsRepository extends JpaRepository<EvenementsEntity, Integer>{

}
