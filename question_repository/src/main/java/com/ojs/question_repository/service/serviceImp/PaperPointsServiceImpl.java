package com.ojs.question_repository.service.serviceImp;

import com.ojs.question_repository.model.PaperPoints;
import com.ojs.question_repository.mapper.PaperPointsMapper;
import com.ojs.question_repository.service.IPaperPointsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 试卷-覆盖知识点 服务实现类
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Service
public class PaperPointsServiceImpl extends ServiceImpl<PaperPointsMapper, PaperPoints> implements IPaperPointsService {

}
