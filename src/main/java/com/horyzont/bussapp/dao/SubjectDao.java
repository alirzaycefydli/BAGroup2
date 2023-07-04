package com.horyzont.bussapp.dao;

import com.horyzont.bussapp.entities.SubjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectDao extends JpaRepository<SubjectEntity, Integer> {
}