package cn.ytmj.service;

import cn.ytmj.domain.Account;

import java.util.List;

/**
 * @author rui
 * @create 2019-10-04 2:49
 */
public interface AccountService {
    //查询所有信息
    public List<Account> findAll();

    //保存账户信息
    public void saveAccount(Account account);
}
