package com.ojs.question_repository.service.serviceImp;

import com.ojs.question_repository.model.Knowledgepoint;
import com.ojs.question_repository.mapper.KnowledgepointMapper;
import com.ojs.question_repository.service.IKnowledgepointService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 知识点表 服务实现类
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Service
public class KnowledgepointServiceImpl extends ServiceImpl<KnowledgepointMapper, Knowledgepoint> implements IKnowledgepointService {

}
