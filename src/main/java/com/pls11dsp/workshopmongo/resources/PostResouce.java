package com.pls11dsp.workshopmongo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pls11dsp.workshopmongo.domain.Post;
import com.pls11dsp.workshopmongo.services.PostService;

@RestController
@RequestMapping(value="/posts")
public class PostResouce {
	
	@Autowired
	private PostService service;
  
	@GetMapping(value="/{id}")  //, method=RequestMethod.GET)  //com esta instrução, não funciona.
		public ResponseEntity<Post> findById(@PathVariable String id){
		Post obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}


