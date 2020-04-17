package com.ojs.question_repository.mapper;

import com.ojs.question_repository.model.Submissions;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 判题提交记录 Mapper 接口
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Mapper
@Repository
public interface SubmissionsMapper extends BaseMapper<Submissions> {

}
