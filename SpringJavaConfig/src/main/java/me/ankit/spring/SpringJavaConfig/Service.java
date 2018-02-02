package me.ankit.spring.SpringJavaConfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

public class Service {
	
	@Autowired
	private DAO dao;

	public DAO getDao() {
		return dao;
	}

	public void setDao(DAO dao) {
		this.dao = dao;
	}
	
	public void save() {
		
		dao.create();
	}
	
	
	@PostConstruct
	public void init() {
		
		System.out.println("init..");
	}

	@PreDestroy
	public void destroy() {
		
		System.out.println("destroy..");
	}
	
	

}
