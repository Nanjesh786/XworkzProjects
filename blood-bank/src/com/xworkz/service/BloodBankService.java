package com.xworkz.service;

import java.sql.SQLException;
import java.util.List;

import com.xworkz.dto.BloodBankDTO;

public interface BloodBankService {
	
	public void validateAndSave(BloodBankDTO bankdto) throws ClassNotFoundException, SQLException;
    public void updateAgeByName(int age,String name) throws ClassNotFoundException, SQLException;
    public void deleteByName(String name) throws ClassNotFoundException, SQLException;
    public List<BloodBankDTO> allDetails() throws SQLException;
    public List<String> allSmokers(String name) throws SQLException;
    public List<BloodBankDTO> allLocation(String loca) throws SQLException;
    public List<String> allContactNo() throws SQLException;

}
