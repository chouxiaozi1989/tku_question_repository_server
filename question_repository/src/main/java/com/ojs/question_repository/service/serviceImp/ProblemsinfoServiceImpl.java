package com.ojs.question_repository.service.serviceImp;

import com.ojs.question_repository.model.Problemsinfo;
import com.ojs.question_repository.mapper.ProblemsinfoMapper;
import com.ojs.question_repository.service.IProblemsinfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 试题基本信息表 服务实现类
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Service
public class ProblemsinfoServiceImpl extends ServiceImpl<ProblemsinfoMapper, Problemsinfo> implements IProblemsinfoService {

}
