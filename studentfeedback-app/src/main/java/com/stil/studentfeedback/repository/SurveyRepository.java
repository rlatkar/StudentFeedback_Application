package com.stil.studentfeedback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stil.studentfeedback.entity.Survey;
/**
Repository interface extending JpaRepository which by default provides CRUD operations eliminating boiler code otherwise written by developer
*/
public interface SurveyRepository extends JpaRepository<Survey,Integer> {
    Survey findByFirstName(String name);
}

