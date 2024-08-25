package com.fei.base.common.service.integration.feign;

import com.mengxiang.base.common.model.result.Result;

public interface DemoClient{
    Result<String> getDemoName(String demoId);
}
