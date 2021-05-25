package BoECdemo.repositories;

import org.springframework.stereotype.Repository;

import BoECdemo.models.User;

import java.sql.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	@Query(value = "select * from users where username = ?1", nativeQuery = true)
	public User checkusername(String username);
	@Query(value = "select * from users where username = ?1 and password = ?2", nativeQuery = true)
	public User checklogin(String username,String password);
	@Query(value = "Insert into users values (username = ?1 , password = ?2,phoneNumber=?3,email=?4,dob=?4,fullName=?5)", nativeQuery = true)
	public User register(String username,String password,String phoneNumber,String email, Date dob, String fullName);
	Optional<User> findByUsername(String username);

}
