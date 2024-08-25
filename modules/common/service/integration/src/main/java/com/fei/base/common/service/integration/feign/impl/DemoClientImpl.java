package com.fei.base.common.service.integration.feign.impl;

import com.mengxiang.base.common.model.result.Result;
import com.fei.base.common.service.integration.feign.DemoClient;
import org.springframework.stereotype.Service;

/**
 * @author fei
 * @date 2020 09-22 16:16
 */
@Service
public class DemoClientImpl implements DemoClient {
    //@Autowired
    //private ThirdPartyDemoClient thirdPartyDemoClient;
    @Override
    public Result<String> getDemoName(String demoId){
        //return thirdPartyDemoClient.getDemoName(demoId);
        return null;
    }
}
