package BoECdemo.webs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import BoECdemo.models.Cart;
import BoECdemo.models.Product;
import BoECdemo.repositories.CartRepository;
import BoECdemo.repositories.ProductRepository;

@Service
public class CartServices {
	@Autowired
	private CartRepository cartRepo;
	@Autowired
	private ProductRepository productRepo;
	public Integer addProduct(Integer productid, Integer quantity){
		Integer addquantity=quantity;
		Product product=productRepo.findById(productid).get();
		Cart cart=cartRepo.findByProduct(product);
		if(cart!=null) {
			addquantity=cart.getQuantity()+quantity;
			cart.setQuantity(addquantity);
		}else {
			cart=new Cart();
			cart.setQuantity(quantity);
			cart.setProduct(product);
		}
		cartRepo.save(cart);
		return addquantity;
	}
}
