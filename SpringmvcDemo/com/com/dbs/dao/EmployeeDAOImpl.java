package com.dbs.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dbs.model.EmployeeVO;

@Repository
public class EmployeeDAOImpl {
	
	@Override
	public List<EmployeeVO> getAllEmployees(){
		List<EmployeeVO> employees = new ArrayList<EmployeeVO>();
		EmployeeVO sunil = new EmployeeVO();
		sunil.setId(1);
		sunil.setFirstName("Sunil");
		sunil.setLastName("Manthu");
		employees.add(sunil);
		
		EmployeeVO rohith = new EmployeeVO();
		rohith.setId(101);
		rohith.setFirstName("Rohith");
		rohith.setLastName("Kodakandla");
		employees.add(rohith);
		
		return employees;
	}
}
