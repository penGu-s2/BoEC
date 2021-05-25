package BoECdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import BoECdemo.models.Cart;
import BoECdemo.models.Product;


@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{
	//@Query(value="Select product.price, cart.product_id From cart INNER JOIN product on cart.product_id=product.id", nativeQuery = true)
	//public Cart addProduct(int id);
	public Cart findByProduct(Product product);
}
