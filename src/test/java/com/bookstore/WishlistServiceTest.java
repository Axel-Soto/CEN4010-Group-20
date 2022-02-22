package com.bookstore;

import com.bookstore.wishList.WishListInterface;
import com.bookstore.wishList.WishlistService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WishlistServiceTest {

  private WishlistService wishlistService;

  @BeforeEach
  public void setup() {
    wishlistService = new WishlistService();
  }

  @Test
  public void itReturnsExpectedWishList() {
    WishListInterface wishListInterface = wishlistService.getWishList();
  }

}
