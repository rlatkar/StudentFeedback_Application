package com.stil.studentfeedback.controller;

import com.stil.studentfeedback.entity.Survey;
import com.stil.studentfeedback.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
/**
Spring boot Rest controller that holds methods mapped to URLs
*/
@CrossOrigin
@RestController
public class SurveyController {

    @Autowired
    private SurveyService service;

    @CrossOrigin
    @PostMapping("/addSurvey")
    public Survey addSurvey(@RequestBody Survey survey) {
        return service.saveSurvey(survey);
    }

    @PostMapping("/addSurveys")
    public List<Survey> addSurveys(@RequestBody List<Survey> surveys) {
        return service.saveSurveys(surveys);
    }

    @GetMapping("/surveys")
    public List<Survey> findAllSurveys() {
        return service.getSurveys();
    }

    @GetMapping("/surveyById/{id}")
    public Survey findSurveyById(@PathVariable int id) {
        return service.getSurveyById(id);
    }

    @GetMapping("/survey/{name}")
    public Survey findSurveyByName(@PathVariable String name) {
        return service.getSurveyByName(name);
    }

    @PutMapping("/update")
    public Survey updateSurvey(@RequestBody Survey survey) {
        return service.updateSurvey(survey);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteSurvey(@PathVariable int id) {
        return service.deleteSurvey(id);
    }
}
