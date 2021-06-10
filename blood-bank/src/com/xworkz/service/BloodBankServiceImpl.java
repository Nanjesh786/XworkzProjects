package com.xworkz.service;

import java.sql.SQLException;
import java.util.List;

import com.xworkz.dao.BloodBankDao;
import com.xworkz.dao.BloodBankDaoImpl;
import com.xworkz.dto.BloodBankDTO;

public class BloodBankServiceImpl implements BloodBankService {
	
	
	public BloodBankDao dao=new BloodBankDaoImpl();

	@Override
	public void validateAndSave(BloodBankDTO bankdto) throws ClassNotFoundException, SQLException {

		if(bankdto!=null) {
			if(bankdto.getDonorAge()>18 && bankdto.getDonorName()!=null) {
				dao.createBloodBank(bankdto);
			}else {
				System.out.println("Enter valid details");
			}
		}else {
			System.out.println("empty object");
		}
		
	}

	@Override
	public void updateAgeByName(int age, String name) throws ClassNotFoundException, SQLException {

		if(age>20 && name!=null) {
			dao.updateAgeWithName(age, name);
		}
		
		
		
	}

	@Override
	public void deleteByName(String name) throws ClassNotFoundException, SQLException {

		if(name!=null) {
			dao.deleteByName(name);
		}
		
		
	}

	@Override
	public List<BloodBankDTO> allDetails() throws SQLException {
		
		

		List<BloodBankDTO> list=dao.allDetails();
		
		return list;
		
		
		
	}

	@Override
	public List<String> allSmokers(String name) throws SQLException {

		List<String> list=dao.allSmokers(name);
		
		return list;
	}

	@Override
	public List<BloodBankDTO> allLocation(String loca) throws SQLException {
	List<BloodBankDTO> list=dao.allLocation(loca);
		
		return list;

	}

	@Override
	public List<String> allContactNo() throws SQLException {
		List<String> list=dao.allContactNo();
		
		return list;

	}

}
