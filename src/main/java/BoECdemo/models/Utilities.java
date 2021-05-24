package BoECdemo.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name="utilities")
public class Utilities implements Serializable{
	 private static final long serialVersionUID = 1L;

	    @Id
	    private int id;
	    
	    @NotNull
	    @JoinColumn(name="userid")
	    @ManyToOne(targetEntity = User.class, cascade=CascadeType.ALL)
	    private User user;
	    
	    @NotNull
	    @JoinColumn(name="roleid")
	    @ManyToOne(targetEntity = User.class, cascade=CascadeType.ALL)
	    private Role role;
}
