package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.UserEntityDTO;

public interface UserRepository extends JpaRepository<UserEntityDTO, Integer>{

}
