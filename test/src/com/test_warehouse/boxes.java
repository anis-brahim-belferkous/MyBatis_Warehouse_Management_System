package com.test_warehouse;

public class boxes {
    private int id;
    private int itemId;
    private int positionId;
    private int itemQuantity;

    public boxes(int id, int itemId, int positionId, int itemQuantity) {
        this.id = id;
        this.itemId = itemId;
        this.positionId = positionId;
        this.itemQuantity = itemQuantity;
    }

    // getters and setters for all attributes

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
}
