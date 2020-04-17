package com.ojs.question_repository.mapper;

import com.ojs.question_repository.model.Problemschoices;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 选项表 Mapper 接口
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Mapper
@Repository
public interface ProblemschoicesMapper extends BaseMapper<Problemschoices> {

}
