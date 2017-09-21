package com.software.technology.model;
import javax.persistence.*;

@Entity
@Table(name="admin")
public class User {
	 @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
	    private Long id;
	 
	    
	    @Column(name="name", nullable=false)
	    private String name;
	 
	    @Column(name="password", nullable=false)
	    private String password;

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

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
}
