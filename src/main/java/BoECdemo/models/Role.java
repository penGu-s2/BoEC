package BoECdemo.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name="role")
public class Role implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
    @NotNull 
    @Column(name="id")
    private int id;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	
}
