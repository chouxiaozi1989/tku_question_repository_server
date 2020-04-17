package com.ojs.question_repository.service.serviceImp;

import com.ojs.question_repository.model.Languages;
import com.ojs.question_repository.mapper.LanguagesMapper;
import com.ojs.question_repository.service.ILanguagesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Service
public class LanguagesServiceImpl extends ServiceImpl<LanguagesMapper, Languages> implements ILanguagesService {

}
