package com.cognizant.truyum.dao;

import com.cognizant.truyum.model.*;

public interface CartDao {

	void addCartItem(long userId, long menuItemId);
	Cart getAllCartItems(long userId) throws CartEmptyException;
	void removeCartItem(long userId, long menuItemId);
}

