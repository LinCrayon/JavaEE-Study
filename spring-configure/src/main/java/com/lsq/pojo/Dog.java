package com.lsq.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author linshengqian
 */
@Component
//将这个类标注为Spring的一个组件，放到容器中！
public class Dog {
    @Value("dog")
    public String name;
}
