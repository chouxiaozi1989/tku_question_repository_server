package com.ojs.question_repository.service.serviceImp;

import com.ojs.question_repository.model.Checkpoints;
import com.ojs.question_repository.mapper.CheckpointsMapper;
import com.ojs.question_repository.service.ICheckpointsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 题解检查点 服务实现类
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Service
public class CheckpointsServiceImpl extends ServiceImpl<CheckpointsMapper, Checkpoints> implements ICheckpointsService {

}
