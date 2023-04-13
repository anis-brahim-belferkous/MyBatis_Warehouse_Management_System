package com.test_warehouse;
import java.util.List;

public interface itemsMapper {
	
	 public List<items> getAllItems();
	    
	    public items getItemById(int id);
	    
	    public void addItem(items item);
	    
	    public void updateItem(items item);
	    
	    public void deleteItem(int id);
}
