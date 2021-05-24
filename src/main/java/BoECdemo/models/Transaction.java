package BoECdemo.models;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="transaction")
public class Transaction implements Serializable{
	private static final long serialVersionUID = 1L;

    @Id
    private int id;
    @Column(name="transactionDate")
    private Date transactionDate;
    
    @Column(name="amount")
    private float amount;
    
    @Column(name="fee")
    private float fee;
    
    @Column(name="result")
    private String result;
}
