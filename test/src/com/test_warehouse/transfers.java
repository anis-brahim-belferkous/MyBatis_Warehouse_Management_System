package com.test_warehouse;

import java.sql.Timestamp;

public class transfers {
    private int id;
    private int boxId;
    private int sourcePositionId;
    private int destinationPositionId;
    private String transferType;
    private Timestamp transferDate;

    public transfers(int id, int boxId, int sourcePositionId, int destinationPositionId, String transferType, Timestamp transferDate) {
        this.id = id;
        this.boxId = boxId;
        this.sourcePositionId = sourcePositionId;
        this.destinationPositionId = destinationPositionId;
        this.transferType = transferType;
        this.transferDate = transferDate;
    }

    // getters and setters for all attributes

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBoxId() {
        return boxId;
    }

    public void setBoxId(int boxId) {
        this.boxId = boxId;
    }

    public int getSourcePositionId() {
        return sourcePositionId;
    }

    public void setSourcePositionId(int sourcePositionId) {
        this.sourcePositionId = sourcePositionId;
    }

    public int getDestinationPositionId() {
        return destinationPositionId;
    }

    public void setDestinationPositionId(int destinationPositionId) {
        this.destinationPositionId = destinationPositionId;
    }

    public String getTransferType() {
        return transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    public Timestamp getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(Timestamp transferDate) {
        this.transferDate = transferDate;
    }
}
