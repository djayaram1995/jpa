package com.boot.service;

import java.util.List;

import com.boot.model.JpaModel;

public interface JpaService {

	JpaModel insert(JpaModel jm);

	String delete(Long id);

	JpaModel find(Long id);

	List<JpaModel> findAll();

	List<JpaModel> findLike(String val);

	List<JpaModel> findNameAndSalary(String v1, String v2);

}