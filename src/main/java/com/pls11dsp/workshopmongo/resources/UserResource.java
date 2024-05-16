package com.pls11dsp.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pls11dsp.workshopmongo.domain.User;
import com.pls11dsp.workshopmongo.service.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
		
		/*@RequestMapping(method=RequestMethod.GET)
		public ResponseEntity<List<User>> findAll(){
			List<User> list = service.findAll();
			return ResponseEntity.ok().body(list);*/
		
	}

}
