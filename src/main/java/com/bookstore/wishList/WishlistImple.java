package com.bookstore.wishList;

import com.google.common.base.Objects;
import java.util.List;
import java.util.UUID;

public class WishlistImple implements WishListInterface {

    private final UUID id;
    private final String name;
    private final List books;

    public WishlistImple(UUID id, String name, List books) {

        this.id = id;
        this.name = name;
        this.books = books;
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List getBooks() {
        return books;
    }

    @Override
    public boolean equals(Object i) {
        if (this == i) {
            return true;
        }
        if (i == null || getClass() != i.getClass()) {
            return false;
        }
        WishlistImple wishList = (WishlistImple) i;
        return Objects.equal
                (id, wishList.id) && Objects.equal(name, wishList.name) && Objects.equal(books, wishList.books);
    }

    @Override
    public String toString() {
        return "WishListImpl{" + ", userId=" + id + ", name='" + name + '\'' + ", books=" + books + '}';
    }
}