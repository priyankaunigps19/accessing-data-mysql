package com.example.accessingdatamysql;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class MainController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping(path="/add/users") 
	public  void addNewUser (@RequestBody User u ) {
			
				userRepository.save(u);
				
	}

	@GetMapping(path="/users")
	public @ResponseBody List<User> getAllUser(){
		return(List<User>) userRepository.findAll();
	}
}
