package com.transflower.tflassessment.Services;

import java.util.List;

import com.transflower.tflassessment.Entity.CandidateAnswer;
import com.transflower.tflassessment.Entity.CandidateTestDetails;
public interface CandidateAnswerService {
    
    boolean insertCandidateAnswer(int candidateId, List <CandidateAnswer>answer);
    List <CandidateAnswer>getCandidateAnswer(int CandidateId,int TestId);
    List<CandidateAnswer>getCandidateAnswerResult(int CandidateId,int TestId);
    CandidateTestDetails getCandidateTestDetails (int CandidateId,int TestId);
}
