package com.foodel.server.orderserver.controller;

import com.foodel.server.orderserver.model.Product;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Controller
public class WebSocketController {



	@MessageMapping("/createOrder")
	@SendTo("/topic/orders")
	@CrossOrigin(origins = "http://localhost:3000")
	public String createOrder(List<Product> products, String clientId, boolean trackOrder) throws Exception {
		System.out.println("SERVER SOCKET: createOrder:" + products.size() + " products total.");
		return "Order received:" + products.size() + " products total.";
	}
}
