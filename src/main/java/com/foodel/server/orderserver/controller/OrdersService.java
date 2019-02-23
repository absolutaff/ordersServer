package com.foodel.server.orderserver.controller;

import com.foodel.server.orderserver.model.Product;
import com.foodel.server.orderserver.model.ProductCategory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrdersService {

	private static final List<Product> products = new ArrayList<>();

	static{
		ProductCategory foodCat = new ProductCategory("Food");

		Product bread = new Product(
				"sku111",
				"bread",
				foodCat);

		Product milk =  new Product(
				"sku222",
				"milk",
				foodCat);

		products.add(bread);
		products.add(milk);
	}

	List<Product> getProducts(){
		return products;
	}
}
