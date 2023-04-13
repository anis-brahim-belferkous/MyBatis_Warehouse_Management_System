package com.test_warehouse;

import java.util.List;

public interface rowsMapper {
	
	 List<rows> getAllRows();
	    rows getRowById(int id);
	    void addRow(rows row);
	    void updateRow(rows row);
	    void deleteRow(int id);
}
