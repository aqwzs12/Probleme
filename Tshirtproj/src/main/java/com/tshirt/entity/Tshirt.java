package com.tshirt.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tshirt {

	@Id
	private long id;
	private String source;
	private String author;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public Tshirt(){}
	
	
}
