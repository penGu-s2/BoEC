package BoECdemo.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;



@Data
@Entity
@Table(name="orderDetail")
public class OrderDetail implements Serializable{

	 private static final long serialVersionUID = 1L;

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int id;
	    
	    @NotNull
	    @JoinColumn(name="orderId")
	    @ManyToOne(targetEntity = Order.class, cascade = CascadeType.ALL)
	    private Order order;
	    
	    @NotNull
	    @JoinColumn(name="productId")
	    @ManyToOne(targetEntity = Order.class, cascade = CascadeType.ALL)
	    private Product product;
	    
	    @Column(name="quantity")
	    private int quantity;
	    
	    @Column(name="price")
	    private float price;
	    
}
