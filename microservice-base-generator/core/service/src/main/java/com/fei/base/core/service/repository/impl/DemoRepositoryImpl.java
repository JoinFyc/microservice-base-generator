package com.fei.base.core.service.repository.impl;

import com.fei.base.core.model.domain.Demo;
import com.fei.base.core.service.repository.DemoRepository;
import com.fei.base.rpc.facade.request.DemoRequest;
import org.springframework.stereotype.Service;

/**
 * @author fei
 * @date 2020-09-22 16:16
 **/
@Service
public class DemoRepositoryImpl implements DemoRepository {
    //数据持久化层
    //@Autowired
    //private DemoDAO demoDAO;

    @Override
    public Demo selectDemoByDemoId(String demoId) {
        //DemoDto demoDto=demoDAO.selectByPrimaryKey(demoId);
        //Demo demo = DemoConverter.convertDemo(demoDto);
        return new Demo();
    }

    @Override
    public Long saveDemo(DemoRequest dto) {
         //DemoDO demoDO = DemoConverter.convertDemoEntity(dto);
         //return demoDAO.insert(demoDO);
        return 1L;
    }
}
