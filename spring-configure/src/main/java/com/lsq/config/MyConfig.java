package com.lsq.config;

import com.lsq.pojo.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author linshengqian
 */
@Configuration
//代表这是一个配置类

@Import(MyConfig2.class)
//导入配置类

public class MyConfig {
    @Bean
    //通过方法注册一个bean，这里的返回值就Bean的类型，方法名就是bean的id！

    public Dog dog(){
        return new Dog();
    }
}