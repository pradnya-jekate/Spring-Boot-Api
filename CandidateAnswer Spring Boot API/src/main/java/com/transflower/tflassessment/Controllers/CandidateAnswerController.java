package com.transflower.tflassessment.Controllers;

import java.util.List;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transflower.tflassessment.Entity.CandidateAnswer;
import com.transflower.tflassessment.Entity.CandidateTestDetails;
import com.transflower.tflassessment.Services.CandidateAnswerService;

@RestController
public class CandidateAnswerController 
{

    @Autowired
    private CandidateAnswerService svc;


    //insert candidate answers
    @PostMapping("/candidateId/{id}")
    public Boolean insertCandidateAnswer(@PathVariable("id") int candidateid,@RequestBody List<CandidateAnswer> answers){
        return svc.insertCandidateAnswer(candidateid, answers);

    }

    //get candidate answers
    @GetMapping("/candidateId/testId")
    public List <CandidateAnswer> getCandidateAnswer(@RequestParam int candidateid,@RequestParam int testid){
        return svc.getCandidateAnswer(candidateid,testid);
    }
    
    //get candidate answer results
    @GetMapping("/candidateId/results")
    public List <CandidateAnswer>getCandidateAnswerResult(@RequestParam int candidateid,@RequestParam int testid){
        return svc.getCandidateAnswerResult(candidateid,testid);
    }

    //get candidate test details
    @GetMapping("/candidateId/details")
    public CandidateTestDetails getCandidateTestDetails(@RequestParam int candidateid,@RequestParam int testid){
        return svc.getCandidateTestDetails(candidateid,testid);
    }

}
