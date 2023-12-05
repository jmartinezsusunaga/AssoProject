package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.UtilisateurEntityDTO;

public interface UserRepository extends JpaRepository<UtilisateurEntityDTO, Integer>{

}
