package com.ojs.question_repository.controller;

import com.ojs.question_repository.service.serviceImp.StatisticServiceImpl;
import com.tku.tku_oauth.oauth.model.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

@RestController
@RequestMapping("/api/statistic")
public class StatisticController {
    @Autowired
    private StatisticServiceImpl statisticService;

    @GetMapping(value = "/queryNumberOfOutlines")
    public ApiResponse queryNumberOfOutlines(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap res = statisticService.queryNumberOfOutlines();
        return ApiResponse.success(res);
    }

    @GetMapping(value = "/queryNumberOfKnowledgePoints")
    public ApiResponse queryNumberOfKnowledgePoints(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap res = statisticService.queryNumberOfKnowledgePoints();
        return ApiResponse.success(res);
    }

    @GetMapping(value = "/queryNumberOfProblems")
    public ApiResponse queryNumberOfProblems(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap res = statisticService.queryNumberOfProblems();
        return ApiResponse.success(res);
    }
}
