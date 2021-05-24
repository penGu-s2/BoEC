package BoECdemo.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="productId")
	private Product product;
	
	@Column(name="quantity")
	private int quantity;
	@Column(name="price")
	private float price;
}
