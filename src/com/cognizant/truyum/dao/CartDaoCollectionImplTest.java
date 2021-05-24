package com.cognizant.truyum.dao;

import com.cognizant.truyum.model.*;

public class CartDaoCollectionImplTest {

	CartDao cartDao = new CartDaoCollectionImpl();
	
	public static void main(String[] args) throws CartEmptyException 
	{	
		CartDaoCollectionImplTest testObj = new CartDaoCollectionImplTest();
		System.out.println("Cart items:");
		testObj.testAddCartItem();
		testObj.testGetAllCartItems();
		
		System.out.println("Cart items after remove:");
		testObj.testRemoveCartItem();
		testObj.testGetAllCartItems();
	}
	
	public void testAddCartItem()
	{
		cartDao.addCartItem(1,1);
		cartDao.addCartItem(1,2);
		cartDao.addCartItem(2,3);
		cartDao.addCartItem(2,4);
	}
	public void testRemoveCartItem()
	{
		cartDao.removeCartItem(2, 4);
	}
	
	public void testGetAllCartItems() throws CartEmptyException
	{
		Cart cart = cartDao.getAllCartItems(2);
		System.out.println(cart.toString());
	}
	
}
