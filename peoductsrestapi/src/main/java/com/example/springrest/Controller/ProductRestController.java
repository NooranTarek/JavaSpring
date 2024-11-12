package com.example.springrest.Controller;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springrest.ApiResponse.ApiResponse;
import com.example.springrest.entities.Product;
import com.example.springrest.repos.ProductRepository;



@RestController
@Slf4j
public class ProductRestController {

	@Autowired
	ProductRepository repository;
	
	@GetMapping("/")
	public List<Product> getProducts(){
		return repository.findAll();
	}
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable("id") int id ){
		return repository.findById(id).get();
	}
	@PostMapping("/")
	@ResponseBody 
	public ApiResponse<Product> addProduct(@RequestBody Product product) {
	    Product savedProduct = repository.save(product);
//	    System.out.println("Product saved: " + savedProduct.getName());
//	    System.out.println("Message: Product added successfully!");
		log.info("Product saved: {}", savedProduct.getName());
		log.info("Message: Product added successfully!");
	    return new ApiResponse<>("Product added successfully!", savedProduct);
	}

	@PutMapping("/")
	public Product updateProduct (@RequestBody Product product) {
		return repository.save(product);
	}
	@DeleteMapping("/{id}")
	public void deleteProduct (@PathVariable ("id") int id ) {
		repository.deleteById(id);
	}
	
	
	
	
	
}
