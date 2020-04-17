package com.ojs.question_repository.service.serviceImp;

import com.ojs.question_repository.model.Problemcategories;
import com.ojs.question_repository.mapper.ProblemcategoriesMapper;
import com.ojs.question_repository.service.IProblemcategoriesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 题型信息表 服务实现类
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Service
public class ProblemcategoriesServiceImpl extends ServiceImpl<ProblemcategoriesMapper, Problemcategories> implements IProblemcategoriesService {

}
