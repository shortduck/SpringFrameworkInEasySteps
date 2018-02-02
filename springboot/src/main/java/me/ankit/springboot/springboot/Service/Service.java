package me.ankit.springboot.springboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import me.ankit.springboot.springboot.dao.DAO;

@Component
public class Service {

	@Autowired
	DAO dao;

	Service(DAO dao) {
		System.out.println("Service constructed....");
		this.dao = dao;
	}

	public void save() {
		dao.create();

	}

}
