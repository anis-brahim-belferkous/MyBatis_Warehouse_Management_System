package com.test_warehouse;

public class positions {
    private int id;
    private int shelfId;
    private String zone;

    public positions(int id, int shelfId, String zone) {
        this.id = id;
        this.shelfId = shelfId;
        this.zone = zone;
    }

    // getters and setters for all attributes

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getShelfId() {
        return shelfId;
    }

    public void setShelfId(int shelfId) {
        this.shelfId = shelfId;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
