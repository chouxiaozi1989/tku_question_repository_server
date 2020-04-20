package com.ojs.question_repository.service;

import java.util.HashMap;

public interface IStatisticService {
    HashMap queryNumberOfOutlines();
    HashMap queryNumberOfKnowledgePoints();
    HashMap queryNumberOfProblems();
}