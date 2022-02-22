package com.bookstore.wishList;

import java.util.ArrayList;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class WishlistService {

    public WishListInterface getWishList() {
        return new WishlistImple(
                UUID.randomUUID(),
                "Daniel",
                new ArrayList()
        );
    }
}
