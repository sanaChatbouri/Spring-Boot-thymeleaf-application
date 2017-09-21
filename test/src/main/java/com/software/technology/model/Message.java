package com.software.technology.model;
import javax.persistence.*;

@Entity
@Table(name="t_message")
public class Message {

	public Message(String name,String email,String comment) {
		this.name = name;
		this.email=email;
		this.comment=comment;
	}
	
	
	public Message(){}
	
	
	 public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
	    private Long id;
	 
	    
	    @Column(name="name", nullable=false)
	    private String name;
	 
	    @Column(name="email", nullable=false)
	    private String email;
	    
	    @Column(name="comment", nullable=false)
	    private String comment;
}
