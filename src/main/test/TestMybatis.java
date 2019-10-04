import cn.ytmj.dao.AccountDao;
import cn.ytmj.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.lf5.util.Resource;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;
import java.util.Properties;

/**
 * @author rui
 * @create 2019-10-04 16:18
 */
public class TestMybatis {
    @Test
    public void run1() throws Exception {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = ssfb.build(in);
        SqlSession sqlSession = build.openSession();
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
        List<Account> all = mapper.findAll();
        System.out.println(all);
        sqlSession.close();
        in.close();
    }
}
