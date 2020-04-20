package com.ojs.question_repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojs.question_repository.model.Outline;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 考试大纲 Mapper 接口
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Mapper
@Repository
public interface OutlineMapper extends BaseMapper<Outline> {
}
