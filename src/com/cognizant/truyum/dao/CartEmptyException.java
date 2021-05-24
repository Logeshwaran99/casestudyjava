package com.cognizant.truyum.dao;

@SuppressWarnings("serial")
public class CartEmptyException extends Exception{
	
	public CartEmptyException()
	{
		System.out.println("The Cart is Empty");
	}
}
