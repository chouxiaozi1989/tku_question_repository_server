package com.ojs.question_repository.service.serviceImp;

import com.ojs.question_repository.model.Paperinfo;
import com.ojs.question_repository.mapper.PaperinfoMapper;
import com.ojs.question_repository.service.IPaperinfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 试卷基本信息 服务实现类
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Service
public class PaperinfoServiceImpl extends ServiceImpl<PaperinfoMapper, Paperinfo> implements IPaperinfoService {

}
