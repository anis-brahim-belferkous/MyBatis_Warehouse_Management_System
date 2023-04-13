package com.test_warehouse;

import java.util.List;

public interface shelvesMapper {

    List<shelves> getAllShelves();

    shelves getShelfById(int id);

    void addShelf(shelves shelf);

    void updateShelf(shelves shelf);

    void deleteShelf(int id);

}
