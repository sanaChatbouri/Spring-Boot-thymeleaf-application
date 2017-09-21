package com.software.technology.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_team")
public class Team{
	
	
	  @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
	    private Long id;
	 
	    
	    @Column(name="team_code", nullable=false)
	    private String teamCode;
	 
	    
	    @Column(name="serviceid ", nullable=false)
	 
	   private String serviceid ;


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getTeamCode() {
			return teamCode;
		}


		public void setTeamCode(String teamCode) {
			this.teamCode = teamCode;
		}


		public String getServiceid() {
			return serviceid;
		}


		public void setServiceid(String serviceid) {
			this.serviceid = serviceid;
		}
	    
	   
	    
	    
	    
	    
	    
	    
}