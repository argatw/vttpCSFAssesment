package vttp2022.assessment.csf.orderbackend.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vttp2022.assessment.csf.orderbackend.models.Order;
import vttp2022.assessment.csf.orderbackend.models.OrderSummary;
import vttp2022.assessment.csf.orderbackend.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private PricingService priceSvc;
	
	
	@Autowired
	private OrderRepository repository;

	// POST /api/order
	// Create a new order by inserting into orders table in pizzafactory database
	// IMPORTANT: Do not change the method's signature
	public void createOrder(Order order) {
		repository.save(order);

	}
	
	public List<Order> getListAll(){
		return repository.findAll();
	}

	// GET /api/order/<email>/all
	// Get a list of orders for email from orders table in pizzafactory database
	// IMPORTANT: Do not change the method's signature
	public List<OrderSummary> getOrdersByEmail(String email) {
		
		List<Order> tmpDatset= repository.findAllByEmail(email) ; //repository.findAll()
		// Use priceSvc to calculate the total cost of an order
		 List<OrderSummary> ordSum= new ArrayList<OrderSummary>();
		 
		
		 tmpDatset.forEach( (ord)->{
			 OrderSummary ordSum1= new OrderSummary();
			 ordSum1.setEmail(  ord.getEmail()  );
			 ordSum1.setName( ord.getName());
			 ordSum1.setAmount( 100f);
			 ordSum1.setOrderId( ord.getOrderId() );			 
		 }
				 );
		 
		 
		 return ordSum;
		
		
	}
}
