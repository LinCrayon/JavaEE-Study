package com.lsq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author linshengqian
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Autowired
    @Qualifier(value = "cat2")
    //@Resource(name = "cat2")
    private Cat cat;
    @Autowired
    @Qualifier(value = "dog1")
    private Dog dog;
    private String str;
}

//  @Autowired是按类型自动转配的，不支持id匹配。
//  需要导入 spring-aop的包！
//  @Autowired(required=false) 说明： false，对象可以为null；true，对象必须存对象，不能为null。

//  @Autowired是根据类型自动装配的，加上@Qualifier则可以根据byName的方式自动装配
//  @Qualifier不能单独使用。

//  @Resource如有指定的name属性，先按该属性进行byName方式查找装配；
//  其次再进行默认的byName方式进行装配；
