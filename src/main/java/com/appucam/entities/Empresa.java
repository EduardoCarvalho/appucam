package com.appucam.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Empresa {
	
	@Id
	@GeneratedValue
    private long id;
    private String razaoSocial;
    private String nomeFantasia;
    
      
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public Empresa(String razaoSocial, String nomeFantasia) {
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
	}
	@Override
	public String toString() {
		return "Empresa [id=" + id + ", razaoSocial=" + razaoSocial + ", nomeFantasia=" + nomeFantasia + "]";
	}
	public Empresa() {
	}
    
}