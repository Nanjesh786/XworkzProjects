package com.xworkz.service;

import java.sql.SQLException;
import java.util.List;

import com.xworkz.dto.AmazonDTO;

public interface AmazonService {

	
	public void validateAndSaveDetails(AmazonDTO dto) throws SQLException;
	public List<AmazonDTO> getAllDetails() throws SQLException;
	public void updateNamewithId(String name,int id) throws SQLException;
	public void deleteById(int id) throws SQLException;
	public List<String> getAllNames() throws SQLException;
	public List<Integer> getAllIdByNames(String name) throws SQLException;
}
