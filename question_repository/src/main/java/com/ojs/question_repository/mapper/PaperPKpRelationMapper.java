package com.ojs.question_repository.mapper;

import com.ojs.question_repository.model.PaperPKpRelation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 知识点-试卷试题关系表 Mapper 接口
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Mapper
@Repository
public interface PaperPKpRelationMapper extends BaseMapper<PaperPKpRelation> {

}
