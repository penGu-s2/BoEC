package BoECdemo.models;

import java.io.Serializable;

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
@Table(name="cart")
public class Cart implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="productId")
	private Product product;
	
	@Column(name="quantity")
	private int quantity;
	
	private float price;
	
	public float getPrice() {
		return this.product.getPrice();
	}
	public void setPrice(float price) {
		this.price=price;
	}
	
}
