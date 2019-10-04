package cn.ytmj.dao;

import cn.ytmj.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author rui
 * @create 2019-10-04 2:44
 */
@Repository
public interface AccountDao {
    //查询所有信息
    @Select("select * from account")
    public List<Account> findAll();

    //保存账户信息
    @Insert("insert into account(name,money) values (#{name},#{money})")
    public void saveAccount(Account account);
}
