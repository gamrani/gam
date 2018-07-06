package com.gam.project.services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gam.project.dao.IResponsableDao;
import com.gam.project.dao.IStudentDao;
import com.gam.project.entities.Responsable;
import com.gam.project.entities.Student;

@Service
public class StudentServices implements IStudentServices{
    
	@Autowired
	private IStudentDao studentDao;
	@Autowired
	private IResponsableDao responsableDao;
	
	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentDao.findAll();
	}

	@Override
	public void store(Student student) {
		// TODO Auto-generated method stub
		Responsable responsable = student.getResponsable();
		responsableDao.save(responsable);
		studentDao.save(student);
		
	}

}
