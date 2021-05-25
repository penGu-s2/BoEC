package BoECdemo.webs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import BoECdemo.models.Product;
import BoECdemo.models.Role;
import BoECdemo.repositories.RoleRepository;

@RestController
@RequestMapping(value="/api/role")
public class RoleController {
	@Autowired
	private RoleRepository roleRepo;

	public RoleController(RoleRepository roleRepo) {
		super();
		this.roleRepo = roleRepo;
	}
	@GetMapping(value ="/getAll")
	public List<Role> getAll(){
		return roleRepo.findAll();
	}
	@PostMapping(value = "/create")
	public List<Role> create(@RequestBody Role Role){
		roleRepo.save(Role);
		return roleRepo.findAll();
	}

	
	
}
