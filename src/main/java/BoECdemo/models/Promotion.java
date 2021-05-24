package BoECdemo.models;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="promotion")
public class Promotion implements Serializable{
	  private static final long serialVersionUID = 1L;

	    @Id
	    private int id;

	    @Column(name="fromDate")
	    private Date fromDate;
	    
	    @Column(name="toDate")
	    private Date toDate;
	    
	    @Column(name="applyForAll")
	    private String applyForAll;
	    
	    @Column(name="discountPercent")
	    private float discountPercent;
	    
	    @Column(name="discountAmount")
	    private float discountAmount;
	    
	    @ManyToOne
	    @JoinColumn(name="productId")
	    private Product product;
	    
	    @Column(name="status")
	    private String status;
	    
	    @Column(name="name")
	    private String name;
	    
}
