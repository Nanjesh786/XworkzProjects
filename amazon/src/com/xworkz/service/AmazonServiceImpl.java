package com.xworkz.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.dao.AmazonDAO;
import com.xworkz.dao.AmazonDaoIMpl;
import com.xworkz.dto.AmazonDTO;

public class AmazonServiceImpl implements AmazonService{

	
	     private AmazonDAO dao=new AmazonDaoIMpl();
	@Override
	public void validateAndSaveDetails(AmazonDTO dto) throws SQLException {
         if(dto!=null) {
        	 if(dto.getName()!=null) {
        		 dao.addDetails(dto);
        	 }
         }
		
		
		
	}

	@Override
	public List<AmazonDTO> getAllDetails() throws SQLException {
        
		
		List<AmazonDTO> list=dao.getAllDetails();	
		
		
		
		return list;
	}

	@Override
	public void updateNamewithId(String name, int id) throws SQLException {
		
		if( id!=0) {
			dao.updateNamewithId(name, id);
		}
		
		
	}

	@Override
	public void deleteById(int id) throws SQLException {
		if(id!=0) {
			dao.deleteById(id);
		}
	}

	
	@Override
	public List<Integer> getAllIdByNames(String name) throws SQLException {
	
  List<Integer> list=dao.getAllIdByNames(name);	
		
		
		
		return list;
	}

	@Override
	public List<String> getAllNames() throws SQLException {
    List<String> list=dao.getAllNames();
		
		
		
		return list;
	
	
	}

	
	
	
	
	
}
