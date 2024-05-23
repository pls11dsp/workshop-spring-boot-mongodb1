package com.pls11dsp.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pls11dsp.workshopmongo.domain.Post;
import com.pls11dsp.workshopmongo.repository.PostRepository;
import com.pls11dsp.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	/*public Post findById(String id) { 
		 Optional<Post> user = repo.findById(id);
		 if(user == null) {
		 throw new ObjectNotFoundException("Objeto não encontrado");
		 }
		 return user;
		}*/
	
	public Post findById(String id) { 
		 Optional<Post> obj = repo.findById(id); 
		 return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado")); 
		}
	}
