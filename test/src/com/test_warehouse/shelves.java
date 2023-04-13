package com.test_warehouse;

public class shelves {
    private int id;
    private int rowId;
    private int level;

    public shelves(int id, int rowId, int level) {
        this.id = id;
        this.rowId = rowId;
        this.level = level;
    }

    // getters and setters for all attributes

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRowId() {
        return rowId;
    }

    public void setRowId(int rowId) {
        this.rowId = rowId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
