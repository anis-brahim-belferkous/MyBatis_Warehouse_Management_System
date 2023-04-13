package com.test_warehouse;

import java.util.List;

public interface transfersMapper {
    List<transfers> getAllTransfers();
    void insertTransfer(transfers transfer);
    void updateTransfer(transfers transfer);
    void deleteTransfer(int id);
}
