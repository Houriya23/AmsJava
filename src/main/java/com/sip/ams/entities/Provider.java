package com.sip.ams.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
@Entity
public class Provider {
@Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private long id;
 @NotBlank(message = "Name is mandatory")
 @Column(name = "name")
 private String name;
 
 @NotBlank(message = "Address is mandatory")
 @Column(name = "address")
 private String address;
 
 @NotBlank(message = "Email is mandatory")
 @Column(name = "email")
 private String email;
 @Column(name = "logo")
 private String logo;
 public Provider() {}
 public Provider(String name, String address, String email ,String logo) {
 this.name = name;
 this.address = address;
 this.email = email;
 this.logo=logo;
 }
 public void setId(long id) {
 this.id = id;
 }
 public long getId() {
 return id;
 }
 public void setName(String name) {
 this.name = name;
 }
 public String getName() {
 return name;
 }
 public void setEmail(String email) {
 this.email = email;
 }
 public String getEmail() {
	 return email;
 }
 public void setAddress(String address) {
 this.address = address;
 }
 public String getAddress() {
 return address;
 }


public void setLogo(String logo) {
	 this.logo = logo;
	 }
	 public String getLogo() {
		 return logo;
	 }

}
