package com.gam.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gam.project.entities.Responsable;

@Repository
public interface IResponsableDao extends JpaRepository<Responsable, Long> {

}
