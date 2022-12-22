package com.kishori.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kishori.entity.Student;

public interface StudentDao extends JpaRepository<Student,Integer>{

}
