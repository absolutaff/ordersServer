package com.foodel.server.orderserver.controller;

import com.foodel.server.orderserver.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrdersController {

	@Autowired
	private OrdersService ordersService;

	@GetMapping(path="/orders", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getProducts(){
		return ordersService.getProducts();
	}
}
