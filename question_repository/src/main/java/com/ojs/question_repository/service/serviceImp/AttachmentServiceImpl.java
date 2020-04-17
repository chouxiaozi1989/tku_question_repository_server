package com.ojs.question_repository.service.serviceImp;

import com.ojs.question_repository.model.Attachment;
import com.ojs.question_repository.mapper.AttachmentMapper;
import com.ojs.question_repository.service.IAttachmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 附件信息表 服务实现类
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Service
public class AttachmentServiceImpl extends ServiceImpl<AttachmentMapper, Attachment> implements IAttachmentService {

}
