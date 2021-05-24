package com.cognizant.truyum.dao;

import com.cognizant.truyum.model.*;
import java.util.*;
import com.cognizant.truyum.util.*;
import java.time.LocalDate;

public class MenuItemDaoCollectionImpl implements MenuItemDao {

	List<MenuItem> menuItemList = new ArrayList<>();
	
	@Override
	public List<MenuItem> getMenuItemListAdmin() {
		
		return menuItemList;
	}

	@Override
	public List<MenuItem> getMenuItemListCustomer() {

		List <MenuItem> customerMenuList = new ArrayList<>();
		for(MenuItem item : menuItemList)
		{
			if(item.getDateOfLaunch().isBefore(LocalDate.now()) && item.isActive())
				customerMenuList.add(item);
		}
		return customerMenuList;
	}

	@Override
	public void modifyMenuItem(MenuItem menuItem) {

		for(MenuItem item : menuItemList)
		{
			if(item.equals(menuItem))
				 menuItemList.set(menuItemList.indexOf(item),menuItem);
		}
	}

	@Override
	public MenuItem getMenuItem(long menuItemId) {

		for(MenuItem item : menuItemList)
		{
			if(item.getId() == menuItemId)
				return item;
		}
		return null;
	}

	MenuItemDaoCollectionImpl() 
	{
		MenuItem menuItem1 = new MenuItem(1,"Sandwich",99,true,DateUtil.convertToDate("15/03/2017"),"Main Course",true);
		menuItemList.add(menuItem1);
		
		MenuItem menuItem2 = new MenuItem(2,"Burger",129,true,DateUtil.convertToDate("23/12/2017"),"Main Course",false);
		menuItemList.add(menuItem2);
		
		MenuItem menuItem3 = new MenuItem(3,"Pizza",149,true,DateUtil.convertToDate("21/08/2018"),"Main Course",false);
		menuItemList.add(menuItem3);
		
		MenuItem menuItem4 = new MenuItem(4,"French Fries",57,false,DateUtil.convertToDate("02/07/2017"),"Starters",true);
		menuItemList.add(menuItem4);
		
		MenuItem menuItem5 = new MenuItem(5,"Chocolate Brownie",32,true,DateUtil.convertToDate("02/11/2022"),"Dessert",true);
		menuItemList.add(menuItem5);

	}
}
