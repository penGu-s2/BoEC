package BoECdemo.webs;

import java.sql.Date;
import java.util.List;

import org.jsondoc.core.annotation.ApiPathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import BoECdemo.models.User;
import BoECdemo.repositories.UserRepository;

@RestController
@RequestMapping(value="/api")
public class UserController {
	@Autowired
	private UserRepository userRepo;
	
	
	public UserController(@RequestBody UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}
	//User
	@GetMapping(value = "/getAll")
	public List<User> getAll(){
		return userRepo.findAll();
	}
	@GetMapping(value = "/checkusername")
	public User getUserByUserName(String username){
		return userRepo.checkusername(username);
	}
	@GetMapping(value="/login")
	public User checklogin(String username,String password) {
		return userRepo.checklogin(username, password);
	}
	@PostMapping("/register")
	public User register(@RequestBody User user) {
		 return  userRepo.save(user);
	}
	@DeleteMapping("/delete/{id}")
	public List<User> removePatient(@ApiPathParam(name = "id") @PathVariable int id){
        userRepo.deleteById(id);
        return userRepo.findAll();
    }

}
