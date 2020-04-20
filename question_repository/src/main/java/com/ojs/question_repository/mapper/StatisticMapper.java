package com.ojs.question_repository.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface StatisticMapper {
    @Select("SELECT o.id, o.SUMMARY outline, " +
            "       COUNT(*)  num " +
            "FROM ojs.knowledgepoint kp, " +
            "     ojs.outline o " +
            "WHERE kp.ISVALID = '1' " +
            "  AND o.ISVALID = '1' " +
            "  AND kp.ID_OUTLINE = o.ID " +
            "GROUP BY o.SUMMARY, o.id ")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "outline", column = "outline"),
            @Result(property = "num", column = "num")
    })
    List<Map<String, Integer>> queryKpOutline();
}
