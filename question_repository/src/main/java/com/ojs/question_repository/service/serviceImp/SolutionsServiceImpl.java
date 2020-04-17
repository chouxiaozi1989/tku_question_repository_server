package com.ojs.question_repository.service.serviceImp;

import com.ojs.question_repository.model.Solutions;
import com.ojs.question_repository.mapper.SolutionsMapper;
import com.ojs.question_repository.service.ISolutionsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 题解信息 服务实现类
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Service
public class SolutionsServiceImpl extends ServiceImpl<SolutionsMapper, Solutions> implements ISolutionsService {

}
