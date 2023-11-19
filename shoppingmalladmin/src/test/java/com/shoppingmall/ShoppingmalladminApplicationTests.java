package com.shoppingmall;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shoppingmall.entity.Admin;
import com.shoppingmall.repository.AdminRepository;

@SpringBootTest
class ShoppingmalladminApplicationTests {

	
	@Autowired
	private AdminRepository rep;
	
	@Test
	public void testall() {
		
		List<Admin> list=rep.findAll();	
		assertThat(list).size().isGreaterThan(0);
	}

}
