package BoECdemo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import BoECdemo.models.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	

}
