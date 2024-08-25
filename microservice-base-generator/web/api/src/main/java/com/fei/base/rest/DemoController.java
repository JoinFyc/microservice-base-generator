package com.fei.base.rest;

import com.fei.base.biz.service.DemoManager;
import com.fei.base.rpc.facade.request.DemoRequest;
import com.fei.base.rpc.facade.result.DemoResult;
import com.mengxiang.base.common.model.result.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fei
 * @date 2020-09-22 16:16
 **/
@RestController
@RequestMapping("/microservice-base-generator")
@Tag(name = "microservice-base-generator 服务接口")
public class DemoController {

    @Autowired
    private DemoManager demoManager;

    @Resource
    private RedisTemplate redisTemplate;

    @Operation(summary = "getDemo的请求接口",description = "返回结果DemoResult")
    @PostMapping("/getDemoWeb")
    public Result<DemoResult> getDemo(@RequestParam("demoId") String demoId) {
        DemoResult demoResult = demoManager.selectDemoByDemoId(demoId);
        return Result.success(demoResult);
    }

    @PostMapping("/addDemoWeb")
    public Result<String> addDemo(DemoRequest dto) {
        String demoId =demoManager.saveDemo(dto);
        return Result.success(demoId);
    }
}
