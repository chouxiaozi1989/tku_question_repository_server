package com.ojs.question_repository.controller;

import com.ojs.question_repository.utils.MD5Util;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/test")
public class testController {

    @GetMapping("/printUser")
    public void printUser(HttpServletRequest request) {
        System.out.println(request.getAttribute("user").toString());
    }

    public static void main(String[] args) {
        long timestamp = System.currentTimeMillis();
        System.out.println(timestamp);
        String signString = timestamp + "question_repository" + "sa";
        String sign = MD5Util.encode(signString);
        System.out.println(sign);
        System.out.println("-------------------");
//        signString = "123" + "de46dd3a-9ef9-4af7-b1c3-00e840e12a21" + timestamp + "A1scr6";
//        JSONObject p = new JSONObject(true);
//        p.put("userid", "CY");
//        p.put("password", "sa");
//        signString = p.toJSONString() + "&sa" + "a14746ec-1092-47a1-bad3-7ff54dbaa41c" + timestamp + "A1scr6";
        signString = "sa" + "e0e17ec7-8cfd-4111-8d88-4e75da2fdbb1" + timestamp + "A1scr6";
        sign = MD5Util.encode(signString);
        System.out.println(sign);
    }
}
