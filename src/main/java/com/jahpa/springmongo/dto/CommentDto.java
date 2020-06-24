package com.jahpa.springmongo.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String text;
	private Date date;
	private AutorDto autor;
	
	public CommentDto() {
		
	}
	
	public CommentDto(String text, Date date, AutorDto autor) {
		super();
		this.text = text;
		this.date = date;
		this.autor = autor;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public AutorDto getAutor() {
		return autor;
	}

	public void setAutor(AutorDto autor) {
		this.autor = autor;
	}
}
