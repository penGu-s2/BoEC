package BoECdemo.webs;

import java.util.List;

import org.jsondoc.core.annotation.ApiMethod;
import org.jsondoc.core.annotation.ApiPathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import BoECdemo.models.Cart;
import BoECdemo.models.Product;
import BoECdemo.repositories.CartRepository;
import BoECdemo.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/api/cart")
public class CartController {
	@Autowired
	private CartServices cartSer;
	@Autowired
	private CartRepository cartRepo;
	@GetMapping("/getAll")
	public List<Cart> getAll(){
		return cartRepo.findAll();
	}
	@PostMapping("/add/{pid}/{qty}")
	public String addProductToCart(@PathVariable("pid")Integer productid,
			@PathVariable("qty") Integer quantity) {
		System.out.println("addProduct"+productid+"-"+quantity);
		Integer addQuantity=cartSer.addProduct(productid, quantity);
		return addQuantity+"  ";
	}
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	@ApiMethod(description = "Remove the product with the provided ID from the database")
	public List<Cart> remove(@ApiPathParam(name = "id") @PathVariable int id){
		cartRepo.deleteById(id);

		return cartRepo.findAll();
	}
}
