package com.software.technology.model;

import javax.persistence.*;

@Entity
@Table(name="t_appel")
public class Appel {
	
	
	  @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
	    private Long id;
	 
	    
	    @Column(name="name", nullable=false)
	    private String name;
	 
	    @Column(name="email", nullable=false)
	    private String email;
	 
	    @Column(name="site", nullable=false)
	    private String site;
	    
	    
	    @Column(name="service_code", nullable=false)
	    private int serviceCode;
	    
	    @Column(name="description", nullable=false)
	 
	   private String description;
	    
	    @Column(name="answer", nullable=true)
	
		   private String answer;
		    
	    

		public String getAnswer() {
			return answer;
		}

		public void setAnswer(String answer) {
			this.answer = answer;
		}

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

		public String getSite() {
			return site;
		}

		public void setSite(String site) {
			this.site = site;
		}

		public int getServiceCode() {
			return serviceCode;
		}

		public void setServiceCode(int serviceCode) {
			this.serviceCode = serviceCode;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

	    
	    
	    
}