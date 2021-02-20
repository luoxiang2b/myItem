package com.java.teaching.web.controller;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.CircleCaptcha;
import com.java.teaching.constast.SysConstast;
import com.java.teaching.entity.SysUser;
import com.java.teaching.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 登录控制器
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * 跳转到登录页面
     * @return
     */
    @GetMapping(value = "/login.action")
    public String login() {

        return "system/main/login";
    }


//    @PostMapping(value = "/login.action")
//    public String login(String username, String password, String code, HttpSession session, HttpServletRequest request) throws Exception {
//        SysUser sysUser = this.userService.login(username, password);
//
//        String sessionCode = (String)session.getAttribute("code");
////        先判断验证码是否正确(一般忽略字母大小写)
//        if(sessionCode.equalsIgnoreCase(code)) {
//            if (sysUser != null) {
//                session.setAttribute("sysUser", sysUser);
//                return "redirect:/sys/index.action";
//            }
//        } else {
//            request.setAttribute("msg", "验证码错误");
//            return "system/main/login";
//        }
//
//        request.setAttribute("msg", SysConstast.LOGIN_ERROR_MSG);
//        return "system/main/login";
//    }

    /**
     * 登录验证
     * @param username
     * @param password
     * @param code
     * @param session
     * @param request
     * @return
     * @throws Exception
     */
    @PostMapping(value = "/login.action")
    public String login(String username, String password, String code, HttpSession session, HttpServletRequest request) throws Exception {
        String sessionCode = (String) session.getAttribute("code");
//        验证码不匹配的情况
        if(sessionCode == null || code == null || !sessionCode.equalsIgnoreCase(code)) {
            request.setAttribute("msg", SysConstast.CODE_MSG);
            return "system/main/login";
        }

//        获取主体
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {
//            登录
            subject.login(token);
//            获取身份（登录成功的情况）
            SysUser sysUser = (SysUser) subject.getPrincipal();
            session.setAttribute("sysUser", sysUser);
            return "redirect:/sys/index.action";
        } catch (Exception e) {
            e.printStackTrace();
//            登录失败的情况
            request.setAttribute("msg", SysConstast.LOGIN_ERROR_MSG);
            return "system/main/login";
        }
    }

    /**
     * 生成验证码（4位数）
     * @param response
     * @param session
     * @throws IOException
     */
    @GetMapping(value = "/getCode.action")
    public void getCode(HttpServletResponse response, HttpSession session) throws IOException {
        //定义图形验证码的长、宽、验证码字符数、干扰元素个数
        CircleCaptcha captcha = CaptchaUtil.createCircleCaptcha(116, 36, 4, 20);
        //图形验证码写出，可以写出到文件，也可以写出到流
        captcha.write(response.getOutputStream());
        session.setAttribute("code", captcha.getCode());
    }

    /**
     * 登出
     * @param session
     * @return
     */
//    @GetMapping(value = "/logout.action")
//    public String logout(HttpSession session) {
////        1.获取session中的用户对象
//        SysUser user = (SysUser)session.getAttribute("sysUser");
////        2.如果用户不为空，将session设为失效状态
//        if(user != null) {
//            session.invalidate();
//        }
//
////        3.重定向到登录页面
//        return "redirect:/index.jsp";
//    }

}
