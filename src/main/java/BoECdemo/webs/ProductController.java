package BoECdemo.webs;

import BoECdemo.models.Product;
import BoECdemo.repositories.ProductRepository;
import org.jsondoc.core.annotation.ApiMethod;
import org.jsondoc.core.annotation.ApiPathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/product")
public class ProductController {
	@Autowired
	private ProductRepository productRepo;


	public ProductController(@RequestBody ProductRepository productRepo) {
		super();
		this.productRepo = productRepo;
	}
	@GetMapping(value = "/getAll")
	public List<Product> getAll(){
		return productRepo.findAll();
	}

	@PostMapping(value = "/create")
	public List<Product> create(@RequestBody Product product){
		productRepo.save(product);
		return productRepo.findAll();
	}

	@RequestMapping(value="/update/{id}",method = RequestMethod.PUT)
	public List<Product> update(@ApiPathParam(name="id" )@PathVariable(value = "id") int id,
									 @RequestBody Product product){
		Product _product =productRepo.findById(id)
				.orElseThrow(() -> new RuntimeException("Product not found for this id :"+id));
		_product.setName(product.getName());
		_product.setDescription(product.getDescription());
		_product.setPrice(product.getPrice());
		_product.setOriginalPrice(product.getOriginalPrice());
		_product.setDetails(product.getDetails());
		_product.setStock(product.getStock());
		_product.setViewCount(product.getViewCount());
		_product.setDateCreated(product.getDateCreated());
		productRepo.save(_product);
		return productRepo.findAll();

	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	@ApiMethod(description = "Remove the Product with the provided ID from the database")
	public List<Product> remove(@ApiPathParam(name = "id") @PathVariable int id){
		productRepo.deleteById(id);

		return productRepo.findAll();
	}
}