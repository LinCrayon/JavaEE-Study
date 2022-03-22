package com.lsq.mapper;

import com.lsq.pojo.Account;

import java.util.List;

/**
 * @author linshengqian
 */
public interface AccountMapper {
   public List<Account> selectAccount();

   public int addAccount(Account account);

   public int deleteAccount(int id);


}
