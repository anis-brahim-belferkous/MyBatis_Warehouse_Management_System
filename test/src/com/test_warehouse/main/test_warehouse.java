package com.test_warehouse.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.test_warehouse.*;

import com.test_warehouse.rows;
import com.test_warehouse.rowsMapper;
import com.test_warehouse.shelvesMapper;


public class test_warehouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SqlSessionFactory SqlsessionFactory = null ;

        InputStream inputStream ;
        
		
				try {
					//inputStream = Resources.getResourceAsStream(resource);
					File configFile = new File("C:/Users/user/eclipse-workspace/test/src/com/test_warehouse/mybatis-config.xml");
					inputStream = new FileInputStream(configFile);
					SqlsessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				 
				 try (SqlSession session = SqlsessionFactory.openSession()) {
					   
					 //  database operations
					 //--------------Operation On shelves-------------
			           
			            System.out.println("------------------------------- ");
			            System.out.println("Operation On Rows ");
			                 
					rowsMapper rm = session.getMapper(rowsMapper.class);
					// Insert a new row
					 rows row5 = new rows( 8,  "row xo ");
					 rm.addRow(row5);
				     session.commit();
				     
			        // Get all rows
					     List<rows> rowsList = rm.getAllRows();
					     
				            for (rows row : rowsList) {
				                System.out.println(row.getId() + ", " + row.getName());
				            }
				            
			        // Update a row
				            
			            rows row2 = new rows(2, "Updated Row 2");
			            rm.updateRow(row2);
			            session.commit();

			        // Get a row by ID
			            
			            rows row3 = rm.getRowById(3);
			            System.out.println("get row by id : " + row3.getId() + ", " + row3.getName());
				     
			        // Delete a row
			            rm.deleteRow(6);
			            session.commit();
				     
			            
			            
			            
			            
			        //--------------Operation On shelves-------------
			            
			            System.out.println("------------------------------- ");

			            System.out.println("Operation On shelves ");
			            
						shelvesMapper rm1 = session.getMapper(shelvesMapper.class);
						shelves shelf1 = new shelves(4, 8, 2);
						rm1.addShelf(shelf1);
			            session.commit();

						
						// Get all shelves
					     List<shelves> shelvesList = rm1.getAllShelves();
					     
				            for (shelves shelf : shelvesList) {
				                System.out.println("shelf id : " +shelf.getId() + ", row id of the shelf : " + shelf.getRowId()+" , level of the shelf is :"+ shelf.getLevel());
				            }
				            
				         // Update a shelf
				            
				            shelves shelf = new shelves(4, 8, 3);
				            rm1.updateShelf(shelf);
				            session.commit();

				        // Get a shelf by ID
				            
				            shelves shelf2 = rm1.getShelfById(2);
				            System.out.println("shelf id : " +shelf2.getId() + ", row id of the shelf :  " + shelf2.getRowId()+", level of the shelf is :"+ shelf2.getLevel());
					     
				        // Delete a shelf
				            rm1.deleteShelf(1); 
				            System.out.println("shelf id you selected was deleted " );

				            session.commit(); 
				            
				            
				            
				          //--------------Operation On items --------
				            System.out.println("------------------------------- ");

				            System.out.println("Operation On items ");
				            
				            itemsMapper rm2 = session.getMapper(itemsMapper.class);
							items item1 = new items(5, "watter bottle","green", "Water Bottle is double-walled to keep your water cool for up to 24 hours");
							rm2.addItem(item1);
				            session.commit();

							
							// Get all items
						     List<items> itemsList = rm2.getAllItems();
						     
					            for (items item : itemsList) {
					                System.out.println("item  id : " +item.getId() + ",kind of item " + item.getName()+", item color :"+item.getColor()+", item description : "+item.getDescription());
					            }
					            
					         // Update a item
					            
					            items item2 = new items(5, "watter bottle","red", "Water Bottle is double-walled to keep your water cool for up to 24 hours");
					            rm2.updateItem(item2);
					            session.commit();

					        // Get a item by ID
					            
					            items item3 = rm2.getItemById(2);
					            System.out.println("item  id : " +item3.getId() + ",kind of item " + item3.getName()+", item color :"+item3.getColor()+", item description : "+item3.getDescription());
						     
					        // Delete a item
					            rm2.deleteItem(1);
					            System.out.println("item id you were selected,it was deleted " );

					            session.commit(); 
				            
					          //--------------Operation On boxes --------
					            System.out.println("------------------------------- ");

					            System.out.println(" <- We can apply several different operations so on .. ->");
				            

				     session.close();
					 
					 
					} catch (Exception e) {
						e.printStackTrace();
					}
				 
	}

}
