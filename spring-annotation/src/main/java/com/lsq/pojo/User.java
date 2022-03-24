package com.lsq.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @author linshengqian
 */
@Controller("user")
// @Component相当于配置文件中 <bean id="user" class="当前注解的类"/>
@Scope("prototype")
public class User {
    @Value("linshengqian")
    // 相当于配置文件中 <property name="name" value="linshengqian"/>
    public String name;
}


//  @Component三个衍生注解
//  @Controller：web层
//  @Service：service层
//  @Repository：dao层

//  作用域
//  @scope
//  singleton：默认的，Spring会采用单例模式创建这个对象。关闭工厂 ，所有的对象都会销毁。
//   prototype：多例模式。关闭工厂 ，所有的对象不会销毁。内部的垃圾回收机制会回收
