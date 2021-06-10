package com.xworkz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static com.xworkz.constants.Constants.DRIVER_CLASS_NAME;
import static com.xworkz.constants.Constants.URL;
import static com.xworkz.constants.Constants.INSERT_QUERY;
import static com.xworkz.constants.Constants.SELECT_QUERY;
import static com.xworkz.constants.Constants.UPDATE_NAME_BY_ID;
import static com.xworkz.constants.Constants.DELETE_BY_ID;
import static com.xworkz.constants.Constants.SELECT_NAME;
import static com.xworkz.constants.Constants.SELECT_ID;
import com.xworkz.constants.Constants;
import com.xworkz.dto.AmazonDTO;

public class AmazonDaoIMpl implements AmazonDAO{
	
	Connection con=null;
	
	public Connection getConnection()
		{
			try {
				Class.forName(DRIVER_CLASS_NAME);
			     con=DriverManager.getConnection(URL);
			     con.setAutoCommit(false);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return con;
		}
		public void closeConnection()
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	@Override
	public void addDetails(AmazonDTO dto) throws SQLException {
        
		PreparedStatement preparedStatement=null;
		      try {
				preparedStatement=getConnection().prepareStatement(INSERT_QUERY);
				preparedStatement.setInt(1, dto.getId());
				preparedStatement.setString(2, dto.getName());
				preparedStatement.setString(3, dto.getLoctaion());
				preparedStatement.setLong(4, dto.getContactNo());
				preparedStatement.setString(5, dto.getPaymentMode());
				preparedStatement.executeUpdate();
				con.commit();
			} catch (Exception e) {
                       con.rollback();
				e.printStackTrace();
			}finally {
				preparedStatement.close();
				closeConnection();
			}
		 
	}

	@Override
	public List<AmazonDTO> getAllDetails() throws SQLException {
             List<AmazonDTO> dtos=new ArrayList<AmazonDTO>();
             Statement state=null;
         try {    
		  state= getConnection().createStatement();
		  ResultSet res=state.executeQuery(SELECT_QUERY);
		  while(res.next()) {
			  AmazonDTO dto=new AmazonDTO();
			  dto.setId(res.getInt("id"));
			  dto.setName(res.getString("name"));
			  dto.setLoctaion(res.getString("location"));
			  dto.setContactNo(res.getLong("contact no"));
			  dto.setPaymentMode(res.getString("payment_mode"));
			  dtos.add(dto);
		  }
		  con.commit();
         }catch(Exception e) {
			  con.rollback();
		  }finally {
			  state.close();
			  closeConnection();
		
	}
		
		
		
		return null;
	}

	@Override
	public void updateNamewithId(String name , int id) throws SQLException {
		PreparedStatement preparedStatement=null;
	try {
		preparedStatement=getConnection().prepareStatement(UPDATE_NAME_BY_ID);
		preparedStatement.setString(1, name);
		preparedStatement.setInt(2, id);
		preparedStatement.executeUpdate();
		con.commit();	
	}catch(Exception e) {
		con.rollback();
	}finally {
		preparedStatement.close();
		closeConnection();
	}
		
	}

	@Override
	public void deleteById(int id) throws SQLException {
		PreparedStatement preparedStatement=null;
		try {
		 preparedStatement=getConnection().prepareStatement(DELETE_BY_ID);
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();
		con.commit();
		}catch(Exception e) {
			con.rollback();
		}finally {
		preparedStatement.close();
		closeConnection();
	   }
		
	}
	@Override
	public List<String> getAllNames() throws SQLException {
		List<String> nlist=new ArrayList();
		System.out.println("from dao names list");
        PreparedStatement state=null;
       try {
    	    state = getConnection().prepareStatement(SELECT_NAME);
    	    ResultSet resultSet=state.executeQuery();
    	    while(resultSet.next()) {
    	         nlist.add(resultSet.getString("name"));
    	    	
    	    }
    	    con.commit();
       }catch(Exception e) {
    	   con.rollback();
       }
       finally {
    	   state.close();
    	   closeConnection();
       }
		return nlist;
	}
	@Override
	public List<Integer> getAllIdByNames(String name) throws SQLException {
		List<Integer> ilist=new ArrayList();
		System.out.println("from dao id list");
        PreparedStatement state=null;
       try {
    	    state = getConnection().prepareStatement(SELECT_ID);
    	      state.setString(1, name);
    	      ResultSet resultSet=state.executeQuery();
    	    	
    	    while(resultSet.next()) {
               ilist.add(resultSet.getInt("id"));
    	    	
    	    	
    	    }
    	    con.commit();
       }catch(Exception e) {
    	   con.rollback();
       }
       finally {
    	   state.close();
    	   closeConnection();
       }
		return ilist;
	}
	
	

}
