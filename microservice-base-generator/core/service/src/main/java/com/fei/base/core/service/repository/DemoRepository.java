package com.fei.base.core.service.repository;

import com.fei.base.core.model.domain.Demo;
import com.fei.base.rpc.facade.request.DemoRequest;

/**
 * @author fei
 * @date 2020-09-22 16:16
 **/
public interface DemoRepository {
    /**
     * 输入demo id 获取 demo
     *
     * @param demoId
     * @return
     */
    Demo selectDemoByDemoId(String demoId);

    /**
     * 保存demo
     *
     * @param dto
     * @return demoId
     */
    Long saveDemo(DemoRequest dto);
}
