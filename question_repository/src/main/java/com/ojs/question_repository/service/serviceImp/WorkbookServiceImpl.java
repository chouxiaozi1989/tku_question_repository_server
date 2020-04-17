package com.ojs.question_repository.service.serviceImp;

import com.ojs.question_repository.model.Workbook;
import com.ojs.question_repository.mapper.WorkbookMapper;
import com.ojs.question_repository.service.IWorkbookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 试题集 服务实现类
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Service
public class WorkbookServiceImpl extends ServiceImpl<WorkbookMapper, Workbook> implements IWorkbookService {

}
