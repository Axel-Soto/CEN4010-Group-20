package com.bookstore.wishList;

import java.util.List;
import java.util.UUID;

public interface WishListInterface {

    UUID getId();

    String getName();

    List getBooks();
}
