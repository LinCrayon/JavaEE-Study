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
public class Account {
    private int id;
    private String username;
    private Double balance;


}
