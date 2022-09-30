package vttp2022.assessment.csf.orderbackend.repositories;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;

import vttp2022.assessment.csf.orderbackend.models.Order;
import vttp2022.assessment.csf.orderbackend.models.OrderSummary;


public interface OrderRepository extends JpaRepository<Order, Integer>{

	List<Order> findAllByEmail(String email);
	
	
}
