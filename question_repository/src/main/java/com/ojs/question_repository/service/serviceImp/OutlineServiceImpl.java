package com.ojs.question_repository.service.serviceImp;

import com.ojs.question_repository.model.Outline;
import com.ojs.question_repository.mapper.OutlineMapper;
import com.ojs.question_repository.service.IOutlineService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 考试大纲 服务实现类
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Service
public class OutlineServiceImpl extends ServiceImpl<OutlineMapper, Outline> implements IOutlineService {

}
