package BoECdemo.repositories;

import org.springframework.stereotype.Repository;

import BoECdemo.models.User;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
}
