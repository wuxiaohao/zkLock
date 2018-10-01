package com.zookeeper.study.service;

/**
 * @author wxh
 * @version 1.0.0
 * @path com.zookeeper.study.service.TestService.java
 * @Description 购买服务
 * @createTime 2018年10月01日 15:51:00
 */
public interface PurcharseService {

    /**
     * @Description: 模拟购买服务
     * @Param: [stock, buyCount]
     * @return: java.lang.String
     * @Author: wxh
     * @Date: 2018/10/1
     */
    public String purcharse(String stock,int buyCount);

}
