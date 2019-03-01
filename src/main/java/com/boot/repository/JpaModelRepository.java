package com.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.model.JpaModel;

public interface JpaModelRepository extends JpaRepository<JpaModel, Long> {
	List<JpaModel> findByNameContains(String val);
	List<JpaModel> findByNameAndSalary(String v1, String v2);
}
