package com.zookeeper.study.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author wxh
 * @version 1.0.0
 * @path com.zookeeper.study.test.BaseJunit4Test.java
 * @Description Junit测试基类
 * @createTime 2018年10月01日 15:48:00
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/applicationContext.xml"})
public class BaseJunit4Test {

}
