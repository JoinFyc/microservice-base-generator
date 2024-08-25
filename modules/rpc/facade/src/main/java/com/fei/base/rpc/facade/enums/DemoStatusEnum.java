package com.fei.base.rpc.facade.enums;

/**
 * @author fei
 * @date 2020-09-22 16:16
 **/
public enum DemoStatusEnum {
    //
    UP(1), DOWN(2);
    private int code;

    DemoStatusEnum(int code) {
        this.code = code;
    }
}
