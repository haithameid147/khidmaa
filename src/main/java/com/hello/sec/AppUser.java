
package com.hello.sec;


import com.fasterxml.jackson.annotation.JsonBackReference;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.lang.NonNull;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hello.model.entity.Foundation;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="appUser"
    ,catalog="senior_app"
)

public class AppUser implements java.io.Serializable{
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)

        private Long id;
	private String userName ;
	//@JsonIgnore
	private String password ;
	private boolean active = true;
        private String roles = "user";       // "ADMIN_ROLE" , "USER_ROLE"
	private Date created = new Date ();
        
        
        @JsonBackReference
        private Set<Foundation> foundation = new HashSet<Foundation>();
     
            
             
	public AppUser(String userName, String password , boolean active , String roles,Set<Foundation> foundation) {
		
		this.userName = userName;
		this.password = password;
		this.active = active ;
		this.roles = roles ;
		this.created = new Date ();
               	this.foundation = foundation;

	}
		public AppUser(String userName, String password , boolean active , String roles) {
		
		this.userName = userName;
		this.password = password;
		this.active = active ;
		this.roles = roles ;
		this.created = new Date ();

	}
	public AppUser() {
		
	}
//        @Id @GeneratedValue(strategy=IDENTITY)
//        @Column(name="id", unique=true, nullable=false)
//	public long getId() {
//		return id;
//	}
            @Id @GeneratedValue(strategy=IDENTITY)
            @Column(name="id", unique=true, nullable=false)
    public Long getId() {
        return id;
    }
        

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public Date getCreated() {
		return created;
	}
        
	public void setCreated(Date created) {
		this.created = created;
	}
       
    @OneToMany(fetch=FetchType.LAZY, mappedBy="appUser" , cascade =CascadeType.ALL )
    public Set<Foundation> getFoundation() {
        return foundation;
    }

    public void setFoundation(Set<Foundation> foundation) {
        this.foundation = foundation;
    }
    
//    	@OneToMany(fetch=FetchType.LAZY, mappedBy="service" , cascade =CascadeType.ALL )
//	public Set<Foundation> getFoundation() {
//		return foundation;
//	}
//
//	public void setFoundation(Set<Foundation> foundation) {
//		this.foundation = foundation;
//	}

        

	

}