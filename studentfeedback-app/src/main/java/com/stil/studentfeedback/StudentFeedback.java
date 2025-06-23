package com.stil.studentfeedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.stil.studentfeedback.repository.SurveyRepository;

/**
Spring boot starter class that starts the application
*/
@SpringBootApplication
public class StudentFeedback {

	@Autowired SurveyRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentFeedback.class, args);
	}
}
