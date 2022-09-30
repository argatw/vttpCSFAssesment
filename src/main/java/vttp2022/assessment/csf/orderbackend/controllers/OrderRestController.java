package vttp2022.assessment.csf.orderbackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vttp2022.assessment.csf.orderbackend.models.Order;
import vttp2022.assessment.csf.orderbackend.models.OrderSummary;
import vttp2022.assessment.csf.orderbackend.services.OrderService;

@RestController
@RequestMapping("/api")
public class OrderRestController {
	
	@Autowired
	private OrderService orderservice;	
	
	@GetMapping("/order/{email}")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<OrderSummary> getOrders(@PathVariable("email") String email){
		return orderservice.getOrdersByEmail(email)	;	
	}
	
	
	@PostMapping("order")
	@CrossOrigin(origins = "http://localhost:4200")
	int createOrder(Order order){	
		System.out.print(order);
		orderservice.createOrder(order);		
		return 1;
	}
	// try method
	@GetMapping("/order")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Order> getOrders(){
		return orderservice.getListAll();		
	}
	

}
