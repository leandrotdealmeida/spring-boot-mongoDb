package com.jahpa.springmongo.services;

public class ObjetcNotFoundException  extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ObjetcNotFoundException(String msg) {
		super(msg);
	}

}
