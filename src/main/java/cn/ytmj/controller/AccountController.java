package cn.ytmj.controller;

import cn.ytmj.domain.Account;
import cn.ytmj.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author rui
 * @create 2019-10-04 2:51
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService as;

    @RequestMapping("findAll")
    public String findAll(Model model) {
        System.out.println("表现层：findAll");
        //调用Service的方法
        List<Account> all = as.findAll();
        model.addAttribute("list", all);
        return "list";
    }

    @RequestMapping("save")
    public void saveAccount(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("保存");
        as.saveAccount(account);
        response.sendRedirect(request.getContextPath() + "/account/findAll");
        return;
    }
}
