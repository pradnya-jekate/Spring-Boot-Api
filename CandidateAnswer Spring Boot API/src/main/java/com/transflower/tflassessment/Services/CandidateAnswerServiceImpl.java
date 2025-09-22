package com.transflower.tflassessment.Services;

import com.transflower.tflassessment.Entity.CandidateAnswer;
import com.transflower.tflassessment.Entity.CandidateTestDetails;
//import com.transflower.tflassessment.repositories.CandidateAnswerRepository;
import com.transflower.tflassessment.Repository.CandidateAnswerRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateAnswerServiceImpl implements CandidateAnswerService {

    private final CandidateAnswerRepository repo;

    @Autowired
    public CandidateAnswerServiceImpl(CandidateAnswerRepository repo) {
        this.repo = repo;
    }

    @Override
    public boolean insertCandidateAnswer(int candidateId, List<CandidateAnswer> answers) {
        return repo.insertCandidateAnswer(candidateId, answers);
    }

    @Override
    public List<CandidateAnswer> getCandidateAnswer(int candidateId, int testId) {
        return repo.getCandidateAnswer(candidateId, testId);
    }

    @Override
    public List<CandidateAnswer> getCandidateAnswerResult(int candidateId, int testId) {
        return repo.getCandidateAnswerResult(candidateId, testId);
    }

    @Override
    public CandidateTestDetails getCandidateTestDetails(int candidateId, int testId) {
        return repo.getCandidateTestDetails(candidateId, testId);
    }

}
