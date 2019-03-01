package com.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.model.JpaModel;
import com.boot.repository.JpaModelRepository;

@Service("jpaService")
public class JpaServiceImpl implements JpaService {

	@Autowired
	public JpaModelRepository jmr; 

	@Override
	public JpaModel insert(JpaModel jm) {
		JpaModel jmRes =jmr.saveAndFlush(jm);
		return jmRes;
	}
	@Override
	public String delete(Long id) {
		JpaModel jm =jmr.findById(id).get();
		jmr.delete(jm);
		return "deleted";
	}
	@Override
	public JpaModel find(Long id) {
		return jmr.findById(id).get();	
	}
	@Override
	public List<JpaModel> findAll() {
		return jmr.findAll();	
	}
	@Override
	public List<JpaModel> findLike(String val) {
		return jmr.findByNameContains(val);
	}
	@Override
	public List<JpaModel> findNameAndSalary(String v1, String v2) {
		return jmr.findByNameAndSalary(v1, v2);
	}
	
}
