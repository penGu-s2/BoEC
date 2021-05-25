package BoECdemo.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="orders")
public class Order implements Serializable{
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Column(name="orderDate")
    private Date orderDate;
    
    
    @JoinColumn(name="cartId")
    @ManyToOne
    private Cart cart;
    
    
    @JoinColumn(name="userId")
    @ManyToOne
    private User user;

    @Column(name="shipName")
    private String shipName;
    
    @Column(name="shipAddress")
    private String shipAddress;
    
    @Column(name="shipEmail")
    private String shipEmail;
    
    @Column(name="shipNumberPhone")
    private String shipNumberPhone;
    
    @Column(name="status")
    private String status;
}
