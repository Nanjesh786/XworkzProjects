package com.xworkz.dao;
import static com.xworkz.constants.Constants.*;
import static com.xworkz.constants.Constants.DRIVER_CLASS_NAME;
import static com.xworkz.constants.Constants.URL;
import static com.xworkz.constants.Constants.INSERT_QUERY;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import  com.xworkz.dto.BloodBankDTO;
import static com.xworkz.constants.Constants.UPDATE_AGE_BY_DONOR_NAME;
import static com.xworkz.constants.Constants.SELECT_QUERY;
public class BloodBankDaoImpl implements BloodBankDao{

	
	private Connection con=null;
	
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
	public void createBloodBank(BloodBankDTO bankdto) throws ClassNotFoundException, SQLException {
		PreparedStatement	preparedStatement=null;
		try 
		{	
				preparedStatement=getConnection().prepareStatement(INSERT_QUERY);
		
		preparedStatement.setInt(1,bankdto.getBloodBankId());
		preparedStatement.setString(2,bankdto.getDonorName());
		preparedStatement.setInt(3,bankdto.getDonorAge());
		preparedStatement.setLong(4,bankdto.getContactNo());
		preparedStatement.setBoolean(5,bankdto.isSmoker());
		preparedStatement.setString(6,bankdto.getBloodBankLoc());
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
	public void updateAgeWithName(int age, String name) throws ClassNotFoundException, SQLException {
		PreparedStatement	 preparedStatement=null;
		try {
			 preparedStatement=getConnection().prepareStatement(UPDATE_AGE_BY_DONOR_NAME);
		preparedStatement.setInt(1, age);
		preparedStatement.setString(2, name);
		preparedStatement.executeUpdate();
		con.commit();
		}
		catch(Exception e) {
			con.rollback();
		}finally {
		preparedStatement.close();
		closeConnection();
		}
	}
	

	@Override
	public void deleteByName(String name) throws ClassNotFoundException, SQLException {
		PreparedStatement preparedStatement=null;
		try {
		 preparedStatement=getConnection().prepareStatement(DELETE_BY_NAME);
		preparedStatement.setString(1, name);
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
	public List<BloodBankDTO> allDetails() throws SQLException {
        List<BloodBankDTO> dtos=new ArrayList();
        Statement state=null;
       try {
    	    state = getConnection().createStatement();
    	    ResultSet resultSet=state.executeQuery(SELECT_QUERY);
    	    while(resultSet.next()) {
    	    	BloodBankDTO dto=new BloodBankDTO();
    	    	dto.setBloodBankId(resultSet.getInt("blood_bank_Id"));
    	    	dto.setDonorName(resultSet.getString("Donor_name"));
    	    	dto.setDonorAge(resultSet.getInt("Donor_age"));
    	    	dto.setContactNo(resultSet.getLong("Donor_ContactNo"));
    	    	dto.setSmoker(resultSet.getBoolean("IsSmoker"));
    	    	dto.setBloodBankLoc(resultSet.getString("blood_bank_location"));
    	    	dtos.add(dto);
    	    	
    	    }
    	    con.commit();
       }catch(Exception e) {
    	   con.rollback();
       }
       finally {
    	   state.close();
    	   closeConnection();
       }
	   
   

          
   return dtos;
         }
	@Override
	public List<String> allSmokers(String name) throws SQLException {
		System.out.println("smoker details");   
		List<String> smoker=new ArrayList<String>();
	        PreparedStatement state=null;
	       try {
	    	    state = getConnection().prepareStatement(SELECT_Smoker);
	    	    state.setString(1, name);
	    	    
	               ResultSet resultSet=state.executeQuery();
	    	    while(resultSet.next()) {
                        smoker.add(resultSet.getString("isSmoker"));
	    	    }
	    	    con.commit();
	       }catch(Exception e) {
	    	   con.rollback();
	       }finally {
	    	   state.close();
	    	   closeConnection();
	       }
		return smoker;
	}

	@Override
	public List<BloodBankDTO> allLocation(String loca) throws SQLException {
		System.out.println("all location");   
		List<BloodBankDTO> loc=new ArrayList<BloodBankDTO>();
	        PreparedStatement state=null;
	       try {
	    	    state = getConnection().prepareStatement(SELECT_LOCATION);
	    	    state.setString(1, loca);

	    	       ResultSet result=     state.executeQuery();
	    	       while(result.next()) {
	    	    	   BloodBankDTO dto= new BloodBankDTO();
	    	    	   dto.setBloodBankId(result.getInt("blood_bank_Id"));
	    	    	   dto.setDonorName(result.getString("Donor_name"));
	    	    	   dto.setDonorAge(result.getInt("Donor_age"));
	    	    	   dto.setContactNo(result.getLong("Donor_ContactNo"));
	    	    	   dto.setSmoker(result.getBoolean("IsSmoker"));
	    	    	   dto.setBloodBankLoc(result.getString("blood_bank_location"));
	    	    	   loc.add(dto);
	    	    	   
	    	       }
	       }
	    		
	       catch(Exception e) {
	    			e.printStackTrace();
	    		}finally {
	    			state.close();
	    			closeConnection();
	    		}return loc;
	       
	}
	@Override
	public List<String> allContactNo() throws SQLException {
          
		System.out.println("all contactno");
		   List<String> clist=new ArrayList<String>();
	        PreparedStatement state=null;
	       try {
	    	    state = getConnection().prepareStatement(SELECT_ContactNo);
	          ResultSet res=   state.executeQuery();
		         while(res.next()) {
		        	  clist.add(res.getString("Donor_ContactNo"));
		         }
	       }
		         catch(Exception e) {
		        	 e.printStackTrace();
		         }
	       finally {
		        	 state.close();
		        	 closeConnection();
		         }
		         
		
		return clist;
	}
		
		
		
	}
	
