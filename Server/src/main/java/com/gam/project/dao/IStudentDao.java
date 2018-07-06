package com.gam.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gam.project.entities.Student;

@Repository
public interface IStudentDao extends JpaRepository<Student,Long>{

}
