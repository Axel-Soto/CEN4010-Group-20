package com.bookstore.wishList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "wishlist")
public class WishlistController {

    private final WishlistService wishListService;

    @Autowired
    public WishlistController(WishlistService wishListService) {
        this.wishListService = wishListService;
    }

    @GetMapping
    public WishListInterface getWishList() {
        WishListInterface wishListIF = wishListService.getWishList();
        return wishListIF;
    }

}