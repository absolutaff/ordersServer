package com.foodel.server.orderserver.controller;

import com.foodel.server.orderserver.model.Order;
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
	@CrossOrigin(origins = "*")
	public String createOrder(Order order) throws Exception {
		System.out.println("SERVER SOCKET: createOrder:" + order.getBuyList().size() + " products total.");
		return "Order received:" + order.getBuyList() + " products total.";
	}
}
