package com.lsq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author linshengqian
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private Cat cat;
    private Dog dog;
    private String str;
}
