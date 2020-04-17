package com.ojs.question_repository.service.serviceImp;

import com.ojs.question_repository.model.Submissions;
import com.ojs.question_repository.mapper.SubmissionsMapper;
import com.ojs.question_repository.service.ISubmissionsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 判题提交记录 服务实现类
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Service
public class SubmissionsServiceImpl extends ServiceImpl<SubmissionsMapper, Submissions> implements ISubmissionsService {

}
