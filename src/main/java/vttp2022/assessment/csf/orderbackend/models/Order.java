package vttp2022.assessment.csf.orderbackend.models;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// IMPORTANT: You can add to this class, but you cannot delete its original content
@Entity
@Table(name="Orders")
public class Order {

	@Id
	@GeneratedValue
	private Integer orderId;
	private String name;
	private String email;
	
	@Column(name="pizza_size")
	private Integer size;
	
	private String sauce;
	private Boolean thickCrust;
	private String toppings ;
	private String comments;

	public void setOrderId(Integer orderId) { this.orderId = orderId; }
	public Integer getOrderId() { return this.orderId; }

	public void setName(String name) { this.name = name; }
	public String getName() { return this.name; }

	public void setEmail(String email) { this.email = email; }
	public String getEmail() { return this.email; }

	public void setSize(Integer size) { this.size = size; }
	public Integer getSize() { return this.size; }

	public void setSauce(String sauce) { this.sauce = sauce; }
	public String getSauce() { return this.sauce; }

	public void setThickCrust(Boolean thickCrust) { this.thickCrust = thickCrust; }
	public Boolean isThickCrust() { return this.thickCrust; }

	public void setToppings(String toppings) { this.toppings = toppings; }
	public String getToppings() { return this.toppings; }
	//public void addTopping(String topping) { this.toppings.add(topping); }

	public void setComments(String comments) { this.comments = comments; }
	public String getComments() { return this.comments; }
}
