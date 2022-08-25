package com.devsuperior.primeiroProjeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.primeiroProjeto.entities.Category;
import com.devsuperior.primeiroProjeto.repositories.CategoryRepository;

@SpringBootApplication
public class PrimeiroProjetoApplication implements CommandLineRunner {
	
	@Autowired
	private CategoryRepository categoryRepository; 
	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoApplication.class, args);
		
		
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Category cat1 =  new Category (1L, "Eletronics");
		Category cat2 =  new Category (2L, "Books");
		
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
	}

}
