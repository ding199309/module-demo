package com.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dfz
 * E-mail:  dfz@jkinvest.cn
 * @version 1.0
 * @date 创建时间：2017/8/28 14:30
 * @parameter
 * @return
 */

@Controller
public class DemoController {



    @RequestMapping(value = {"/test",""})
    public  String test(ModelMap modelMap){
        System.out.println(1);
        modelMap.put("key","123456");
        return  "test";
    }
}
