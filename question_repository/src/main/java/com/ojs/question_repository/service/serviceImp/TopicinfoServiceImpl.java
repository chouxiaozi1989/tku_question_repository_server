package com.ojs.question_repository.service.serviceImp;

import com.ojs.question_repository.model.Topicinfo;
import com.ojs.question_repository.mapper.TopicinfoMapper;
import com.ojs.question_repository.service.ITopicinfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 题干信息表 服务实现类
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Service
public class TopicinfoServiceImpl extends ServiceImpl<TopicinfoMapper, Topicinfo> implements ITopicinfoService {

}
