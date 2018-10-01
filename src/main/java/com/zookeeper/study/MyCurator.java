package com.zookeeper.study;

import org.apache.curator.framework.CuratorFramework;

/**
 * @author wxh
 * @version 1.0.0
 * @path com.zookeeper.study.MyCurator.java
 * @Description TODO
 * @createTime 2018年10月01日 15:16:00
 */
public class MyCurator {

    private CuratorFramework curatorFramework;

    public MyCurator(CuratorFramework curatorFramework) {
        this.curatorFramework = curatorFramework;
    }

}
