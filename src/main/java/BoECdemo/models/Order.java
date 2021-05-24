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
@Table(name="order")
public class Order implements Serializable{
	private static final long serialVersionUID = 1L;

    @Id
    private int id;
    
    @Column(name="orderDate")
    private Date orderDate;
    
    @ManyToOne
    @JoinColumn(name="cartId")
    private Cart cart;
    
    @ManyToOne
    @JoinColumn(name="userId")
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
