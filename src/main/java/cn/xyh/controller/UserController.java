package cn.xyh.controller;

import cn.xyh.pojo.User;
import cn.xyh.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/add.do")
    public ModelAndView insertUser(User user) {
        ModelAndView mv = new ModelAndView();
        String tip = "注册失败！";
        int i = userService.insertUser(user);
        if(i > 0) {
            tip = "注册成功！";
        }
        mv.addObject("tip", tip);
        mv.setViewName("show");
        System.out.println("hot-fix test");
        return mv;
    }

    @RequestMapping(value = "/query.do")
    @ResponseBody
    public List<User> queryUser() {
        return userService.queryUser();
    }


}
