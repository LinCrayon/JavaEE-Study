package com.lsq.jdbc;

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
    private Integer id;
    private  String username;
    private Double balance;

}
