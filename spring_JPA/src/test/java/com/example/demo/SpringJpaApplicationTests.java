package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Player;
import com.example.demo.model.repo.PlayerRepository;

@SpringBootTest
class SpringJpaApplicationTests {

	@Autowired
	private PlayerRepository repository;
	
	@Test
	public void testSavePlayer() {
		Player player=new Player();
		player.setId(1l);
		player.setName("nour");
		player.setScore(20);
		repository.save(player);
		Player savedPlayer=repository.findById(1l).get();
		assertNotNull(savedPlayer);
		
	}

}
