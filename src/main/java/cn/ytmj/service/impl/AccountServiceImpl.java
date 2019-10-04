package cn.ytmj.service.impl;

import cn.ytmj.dao.AccountDao;
import cn.ytmj.dao.impl.AccountDaoImpl;
import cn.ytmj.domain.Account;
import cn.ytmj.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author rui
 * @create 2019-10-04 2:50
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao ad;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层查询所有信息");
        return ad.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层保存用户");
        ad.saveAccount(account);
    }
}
