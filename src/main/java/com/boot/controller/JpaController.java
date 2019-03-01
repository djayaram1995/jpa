package com.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.JpaModel;
import com.boot.service.JpaService;

@RestController
public class JpaController {
	
	@Autowired
	public JpaService js; 

	@PostMapping(value ="/")
	public JpaModel insert(@RequestBody JpaModel jm) {
		JpaModel jmRes = js.insert(jm);
		return jmRes;
	}
	@DeleteMapping(value ="/{id}")
	public String delete(@PathVariable Long id) {
		js.delete(id);
		return "deleted";
	}
	@RequestMapping(value ="/{id}")
	public JpaModel find(@PathVariable Long id) {
		return js.find(id);
	}
	@RequestMapping(value ="findLike/{id}")
	public List<JpaModel> findLike(@PathVariable String id) {
		return js.findLike(id);
	}
	@RequestMapping(value ="findLike/{v1}/{v2}")
	public List<JpaModel> findNameAndSalary(@PathVariable String v1, @PathVariable String v2) {
		return js.findNameAndSalary(v1, v2);
	}
	@RequestMapping(value ="/findAll")
	public List<JpaModel> findAll() {
		return js.findAll();
	}
	
	
}
