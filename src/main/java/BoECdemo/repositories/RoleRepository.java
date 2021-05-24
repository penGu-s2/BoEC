package BoECdemo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import BoECdemo.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{
}
