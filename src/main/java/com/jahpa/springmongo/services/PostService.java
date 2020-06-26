package com.jahpa.springmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jahpa.springmongo.domain.Post;
import com.jahpa.springmongo.domain.User;
import com.jahpa.springmongo.repository.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;	

	public Post findById(String id) {
		Optional<Post> post = postRepository.findById(id);
		return post.orElseThrow(() -> new ObjetcNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + User.class.getName()));
	}	
	
	public List<Post> findByTitle(String text) {
		return postRepository.searchTitle(text);
	}

}