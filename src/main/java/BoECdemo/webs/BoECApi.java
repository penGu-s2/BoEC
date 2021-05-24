package BoECdemo.webs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import BoECdemo.models.User;
import BoECdemo.repositories.UserRepository;

@RestController
@RequestMapping(value="/api")
public class BoECApi {
	@Autowired
	private UserRepository userRepo;
	
	
	public BoECApi(@RequestBody UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}
	@GetMapping(value = "/getAll")
	public List<User> getAll(){
		return userRepo.findAll();
	}
	@PostMapping(value="/login")
	public User checklogin(String username,String password) {
		return userRepo.checklogin(username, password);
	}

}
