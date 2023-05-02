package com.example.demo.dao;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.student;

@Repository
public interface StudentRepository extends JpaRepository<student,Integer>{

	public default List<student> sortAppModel(String field){
		return findAll(Sort.by(Direction.ASC,field));
	}
	public List<student>findByNameStartingWith(String prefix);
	public List<student>findByNameEndingWith(String suffix);
	public List<student>findByDepartment(String dept);
	public List<student>findByEmail(String email);
	
	//positional parameter
	@Query("select s from student s where s.department=?1 and s.name=?2" )
	public List<student> getStudentsByDepartment(String dept,String name);
	
	student  findByUsername(String username);
}
