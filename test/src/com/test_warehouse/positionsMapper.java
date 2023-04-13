package com.test_warehouse;

import java.util.List;

public interface positionsMapper {
    List<positions> getAllPositions();
    positions getPositionById(int id);
    void addPosition(positions position);
    void updatePosition(positions position);
    void deletePosition(int id);
}
