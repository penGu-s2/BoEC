package BoECdemo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import BoECdemo.models.Cart;


@Repository
public interface CartRepository extends CrudRepository<Cart, Integer>{

}
