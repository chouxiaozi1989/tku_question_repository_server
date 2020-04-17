package com.ojs.question_repository.service.serviceImp;

import com.ojs.question_repository.model.BizLog;
import com.ojs.question_repository.mapper.BizLogMapper;
import com.ojs.question_repository.service.IBizLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 日志记录表 服务实现类
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Service
public class BizLogServiceImpl extends ServiceImpl<BizLogMapper, BizLog> implements IBizLogService {

}
