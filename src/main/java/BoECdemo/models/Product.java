package BoECdemo.models;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name="product")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@NotNull
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@Column(name="price")
	private float price;
	@Column(name="originalPrice")
	private float originalPrice;
	@Column(name="details")
	private String details;
	@Column(name="stock")
	private int stock;
	@Column(name="viewCount")
	private int viewCount;
	@Column(name="dateCreated")
	private Date dateCreated;
	
}
