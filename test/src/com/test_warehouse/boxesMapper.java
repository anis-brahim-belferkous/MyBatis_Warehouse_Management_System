package com.test_warehouse;

import java.util.List;

public interface boxesMapper {
    List<boxes> getAllBoxes();

    boxes getBoxById(int id);

    void addBox(boxes box);

    void updateBox(boxes box);

    void deleteBox(int id);
}
