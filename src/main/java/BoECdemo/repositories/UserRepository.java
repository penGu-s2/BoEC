package BoECdemo.repositories;

import org.springframework.stereotype.Repository;

import BoECdemo.models.User;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	@Query(value = "select * from users where username = ?1 and password = ?2", nativeQuery = true)
	public User checklogin(String username,String password);
}
