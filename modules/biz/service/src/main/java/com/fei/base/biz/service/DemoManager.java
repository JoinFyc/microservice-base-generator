package com.fei.base.biz.service;

import com.fei.base.rpc.facade.request.DemoRequest;
import com.fei.base.rpc.facade.result.DemoResult;

/**
 * @author fei
 * @date 2020-09-22 16:16
 **/
public interface DemoManager {
    /**
     * select demo by demo id
     *
     * @param demoId
     * @return
     */
    DemoResult selectDemoByDemoId(String demoId);

    /**
     * save demo
     *
     * @param dto
     * @return
     */
    String saveDemo(DemoRequest dto);
}
