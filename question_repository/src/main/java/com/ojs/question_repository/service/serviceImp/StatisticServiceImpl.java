package com.ojs.question_repository.service.serviceImp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ojs.question_repository.mapper.KnowledgepointMapper;
import com.ojs.question_repository.mapper.OutlineMapper;
import com.ojs.question_repository.mapper.ProblemsinfoMapper;
import com.ojs.question_repository.mapper.StatisticMapper;
import com.ojs.question_repository.model.Knowledgepoint;
import com.ojs.question_repository.model.Outline;
import com.ojs.question_repository.model.Problemsinfo;
import com.ojs.question_repository.service.IStatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StatisticServiceImpl implements IStatisticService {
    @Autowired
    private StatisticMapper statisticMapper;

    @Autowired
    private ProblemsinfoMapper problemsinfoMapper;

    @Autowired
    private OutlineMapper outlineMapper;

    @Autowired
    private KnowledgepointMapper knowledgepointMapper;

    @Override
    public HashMap<String, Integer> queryNumberOfOutlines() {
        HashMap<String, Integer> res = new HashMap<>();
        QueryWrapper<Outline> wrapper = new QueryWrapper<>();
        wrapper.eq("ISVALID", "1");
        int num = outlineMapper.selectCount(wrapper);
        res.put("numberOfOutlines", num);
        return res;
    }

    @Override
    public HashMap<String, Object> queryNumberOfKnowledgePoints() {
        HashMap<String, Object> res = new HashMap<>();
        QueryWrapper<Knowledgepoint> wrapper = new QueryWrapper<>();
        wrapper.eq("ISVALID", "1");
        int num = knowledgepointMapper.selectCount(wrapper);
        res.put("numberOfKnowledgePoints", num);
        List<Map<String, Integer>> kpOutline = statisticMapper.queryKpOutline();
        res.put("kpOutline", kpOutline);
        return res;
    }

    @Override
    public HashMap<String, Integer> queryNumberOfProblems() {
        HashMap<String, Integer> res = new HashMap<>();
        QueryWrapper<Problemsinfo> wrapper = new QueryWrapper<>();
        wrapper.eq("ISVALID", "1");
        int all = problemsinfoMapper.selectCount(wrapper);

        wrapper.eq("ISVERIFIED", "1");
        int proved = problemsinfoMapper.selectCount(wrapper);

        wrapper.clear();
        wrapper.eq("ISVALID", "1");
        wrapper.ne("ISVERIFIED", "1");
        int unproved = problemsinfoMapper.selectCount(wrapper);

        res.put("all", all);
        res.put("proved", proved);
        res.put("unproved", unproved);
        return res;
    }
}
