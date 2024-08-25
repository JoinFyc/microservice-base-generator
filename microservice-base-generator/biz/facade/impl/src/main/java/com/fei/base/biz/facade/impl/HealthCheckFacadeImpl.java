package com.fei.base.biz.facade.impl;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fei
 * @date 2020-09-22 16:16
 **/
@RestController
@Tag(name = "健康检查")
public class HealthCheckFacadeImpl {

    @Operation(summary = "SLB健康检测", description = "只做健康检查,无任何作用")
    @GetMapping(value = "/slb/health")
    public void health() {
        //do nothing
    }
}
