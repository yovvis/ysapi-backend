package com.yovvis.ysapiinterface.controller;

import com.yovvis.clientsdk.model.User;
import com.yovvis.ysapiinterface.utils.SignUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 测试用户接口
 *
 * @Author yovvis
 * @Date 2023/11/16
 */
@RestController()
@RequestMapping("/name")
public class UserController {

    @GetMapping("/get")
    public String getUsernameByGet(@RequestParam String name) {
        return "GET你的名字是" + name;
    }

    @PostMapping("/post")
    public String getUsernameByPost(@RequestParam String name) {
        return "POST你的名字是" + name;
    }

    @PostMapping("/user")
    public String getUsernameByRestful(@RequestBody User user, HttpServletRequest request) {
        String accessKey = request.getHeader("accessKey");
        String sign = request.getHeader("sign");
        String body = request.getHeader("body");
        String nonce = request.getHeader("nonce");
        String serverSign = SignUtils.genSign(body, "abcdefg");
        if (!accessKey.equals("yovvis")) {
            throw new RuntimeException("无权限");
        }
        if (Long.parseLong(nonce) > 10000) {
            throw new RuntimeException("无权限");
        }
        if (!sign.equals(serverSign)) {
            throw new RuntimeException("无权限");
        }
        return "POST你的名字是" + user.getName();
    }
}
