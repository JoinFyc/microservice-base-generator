package com.fei.base.rpc.facade.result;

import com.fei.base.rpc.facade.enums.DemoStatusEnum;
import lombok.Getter;
import lombok.Setter;

/**
 * @author fei
 * @date 2020-09-22 16:16
 **/
@Getter
@Setter
public class DemoResult {
    private String result;
    private DemoStatusEnum statusEnum;
}
