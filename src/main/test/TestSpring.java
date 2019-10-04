import cn.ytmj.domain.Account;
import cn.ytmj.service.AccountService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author rui
 * @create 2019-10-04 3:40
 */
public class TestSpring {
    @Test
    public void run1() {
        //加载spring配置文件
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        AccountService accountService = (AccountService) ac.getBean("accountService");
        //调用方法
        accountService.findAll();
    }
}
