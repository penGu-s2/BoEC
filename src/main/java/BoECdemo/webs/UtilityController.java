package BoECdemo.webs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import BoECdemo.models.Product;
import BoECdemo.models.User;
import BoECdemo.models.Utilities;
import BoECdemo.repositories.RoleRepository;
import BoECdemo.repositories.UserRepository;
import BoECdemo.repositories.UtilitiesRepository;

@RestController
@RequestMapping(value = "/api/utility")
public class UtilityController {
	@Autowired
	private UtilitiesRepository utilityRepo;
	@Autowired
	private RoleRepository roleRepo;
	@Autowired
	private UserRepository userRepo;

	
	public UtilityController(UtilitiesRepository utilityRepo, RoleRepository roleRepo, UserRepository userRepo) {
		super();
		this.utilityRepo = utilityRepo;
		this.roleRepo = roleRepo;
		this.userRepo = userRepo;
	}


	 @GetMapping(value = "/getAll")
		public ResponseEntity<List<Utilities>> getAll() {
			if(utilityRepo.getAll().size() < 0)
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			
			return new ResponseEntity<List<Utilities>>(utilityRepo.getAll(), HttpStatus.OK);
		}
	 
	// findById
		@GetMapping(value = "/{id}")
		public ResponseEntity<Utilities> getById(@PathVariable("id") Long id) {
			return new ResponseEntity<Utilities>(utilityRepo.getById(id).get(), HttpStatus.OK);
		}
}
