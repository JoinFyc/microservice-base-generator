package com.fei.base.biz.service.impl;

import com.fei.base.biz.service.DemoManager;
import com.fei.base.core.model.domain.Demo;
import com.fei.base.core.service.repository.DemoRepository;
import com.fei.base.rpc.facade.enums.DemoStatusEnum;
import com.fei.base.rpc.facade.request.DemoRequest;
import com.fei.base.rpc.facade.result.DemoResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fei
 * @date 2020-09-22 16:16
 **/
@Service
public class DemoManagerImpl implements DemoManager {
    @Autowired
    private DemoRepository demoRepository;

    @Override
    public DemoResult selectDemoByDemoId(String demoId) {
        Demo demo = demoRepository.selectDemoByDemoId(demoId);
        DemoResult demoResult = new DemoResult();
        demoResult.setResult(demo.getContent());
        demoResult.setStatusEnum(DemoStatusEnum.UP);
        return demoResult;
    }

    @Override
    public String saveDemo(DemoRequest dto) {
        Long demoId = demoRepository.saveDemo(dto);
        return demoId + "";
    }
}
