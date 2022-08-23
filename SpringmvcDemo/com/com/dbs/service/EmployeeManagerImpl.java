package com.dbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dbs.dao.EmployeeDAO;
import com.dbs.model.EmployeeVO;

public class EmployeeManagerImpl implements EmployeeManager {
	@Autowired
	EmployeeDAO dao;
	
	@Override
	public List<EmployeeVO> getAllEmployees(){
		return dao.getAllEmployees();
	}
}
