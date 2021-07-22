package com.soap.soapapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.soap.soapapp.dto.SoapDTO;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
public class SoapDAOImpl implements SoapDAO{

	@Autowired
	private SessionFactory factory;
	
	@Override
	public void createDTO(SoapDTO dto) {
		Session session=null;
		try {
		session=factory.openSession();
		session.beginTransaction();
		session.save(dto);
		session.getTransaction().commit();
		}
		catch (Exception e) {
			if(session.getTransaction()!=null) {
				
				session.getTransaction().rollback();
			}
			e.printStackTrace();
		}
		finally {
			if(session!=null) {
				session.close();
			}
		}
		
		
	}

}
