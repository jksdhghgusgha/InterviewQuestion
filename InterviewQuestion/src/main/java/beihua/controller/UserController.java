package beihua.controller;

import beihua.domain.Detail;
import beihua.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author :DYH
 * @date :2023/2/7 13:52
 * ClassName :UserController
 * Package :beihua.controller
 * Description :
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/checkDetails.do")
    public List<Detail> checkDetails(String id){
        return userService.checkDetails(id);
    }

    @ResponseBody
    @RequestMapping("/consume_100.do")
    public int consume(String id){
       return userService.expend_100(id);
    }

    @ResponseBody
    @RequestMapping("/checkWallet.do")
    public double checkWallet(String id){
        return userService.checkWallet(id);
    }
    @ResponseBody
    @RequestMapping("/drawback.do")
    public int drawback(String id){
        return userService.drawBack_20(id);
    }

}
