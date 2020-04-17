package com.ojs.question_repository.service.serviceImp;

import com.ojs.question_repository.model.PaperCheckpoints;
import com.ojs.question_repository.mapper.PaperCheckpointsMapper;
import com.ojs.question_repository.service.IPaperCheckpointsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 试卷-题解检查点 服务实现类
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Service
public class PaperCheckpointsServiceImpl extends ServiceImpl<PaperCheckpointsMapper, PaperCheckpoints> implements IPaperCheckpointsService {

}
