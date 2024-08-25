package com.fei.base.common.dal.mapper;
import java.util.List;
/**
 * 数据库字段检查
 * @author generate
 */
public interface DbPreCheckMapper{
    /**
     * desc:check table.<br/>
     * @return int
     */
    List<String> dbColumnCheck();
}
