package com.fei.base.biz.facade.impl;

import com.fei.base.biz.service.DemoManager;
import com.fei.base.rpc.facade.feign.DemoFacade;
import com.fei.base.rpc.facade.request.DemoRequest;
import com.fei.base.rpc.facade.result.DemoResult;
import com.mengxiang.base.common.model.result.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fei
 * @date ${DATE}
 **/
@RestController
@Tag(name = "demo 服务接口", description = "demo相关的服务接口")
public class DemoFacadeImpl implements DemoFacade {

    @Autowired
    private DemoManager demoManager;

    @Override
    @Operation(summary = "get demo 接口", description = "get demo 接口")
    public Result<DemoResult> getDemo(@RequestParam("demoId") String demoId) {
        DemoResult demoResult = demoManager.selectDemoByDemoId(demoId);
        return Result.success(demoResult);
    }

    @Override
    public Result<String> addDemo(DemoRequest dto) {
        String demoId = demoManager.saveDemo(dto);
        return Result.success(demoId);
    }

}
