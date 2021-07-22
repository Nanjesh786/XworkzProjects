package com.soap.soapapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.soap.soapapp.dao.SoapDAO;
import com.soap.soapapp.dto.SoapDTO;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
public class ServiceImpl implements Service {
      @Autowired
  	private SoapDAO dao;
  	
	
	

	@Override
	public void validateAndCreateDTO(SoapDTO dto) {

		if(dto!=null) {
			dao.createDTO(dto);
		}else {
			System.out.println("DTO is empty");
		}
		
	}
	
	
	

}
