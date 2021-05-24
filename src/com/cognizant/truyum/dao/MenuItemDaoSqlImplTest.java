package com.cognizant.truyum.dao;

import java.util.List;
import java.util.Scanner;

import com.cognizant.truyum.model.*;
import com.cognizant.truyum.util.*;

public class MenuItemDaoSqlImplTest {

	MenuItemDao menuItemDao = new MenuItemDaoSqlImpl();
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		MenuItemDaoSqlImplTest testObj = new MenuItemDaoSqlImplTest();
		
		System.out.println("Before modification...");
		testObj.testGetMenuItemListAdmin();
		testObj.testGetMenuItemListCustomer();
		
		MenuItem item = new MenuItem(1,"Sandwich",10,true,DateUtil.convertToDate("15/03/2017"),"Main Course",true); 
		testObj.testModifyMenuItem(item);
		
		System.out.println("After modification...");
		testObj.testGetMenuItemListAdmin();
		testObj.testGetMenuItemListCustomer();
		
		System.out.println("Enter the procut id to be searched :");
		testObj.testGetMenuItem(in.nextInt());
	}
	
	public void testGetMenuItemListAdmin()
	{
		List<MenuItem> adminMenuList = menuItemDao.getMenuItemListAdmin();
		
		System.out.println("Admin MenuList :");
		for(MenuItem item : adminMenuList)
			System.out.println(item.toString());
		
		System.out.println("\n");
	}
	
	public void testGetMenuItemListCustomer()
	{
		List<MenuItem> customerMenuList = menuItemDao.getMenuItemListCustomer();
		
		System.out.println("Customer MenuList :");
		for(MenuItem item : customerMenuList)
			System.out.println(item.toString());
		
		System.out.println("\n");
	}
	
	public void testModifyMenuItem(MenuItem menuItem)
	{
		menuItemDao.modifyMenuItem(menuItem);
	}
	
	public void testGetMenuItem(long menuItemId)
	{
		MenuItem item = menuItemDao.getMenuItem(menuItemId);
		
		System.out.println("MenuItem based on id "+menuItemId+" :");
		if(item == null)
			System.out.println("No Menu item for this id "+menuItemId);
		else
			System.out.println(item.toString());
	}
}

