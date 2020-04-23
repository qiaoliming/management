package com.qlm.base.controller;
import org.springframework.web.bind.annotation.*;

/**
* @Description:    对外开放接口
* @Author:         qiaoliming
* @CreateDate:     2020/4/22 9:51
*/
@RestController
@RequestMapping("/api")
public class ApiController {
    @GetMapping(value="/test")
    public String wcTest() {
        return "欢迎来到测试接口！";
    }

    /**
     * http://localhost:8989/api/getInfo?param=1
     *
     * name代表提交参数名。
     * required意思是这个参数是否必需，默认true，没有该参数，无法调用此方法；这里设为false，有无该参数都可以调用。
     * defaultValue如果该参数值为空，那么就使用默认值。
     * get传参请求
     * @param param
     * @return
     */
    @GetMapping(value = "getInfo")
    public String getInfo(@RequestParam(name = "param",
            required = false,
            defaultValue = "param dafault value") String param){
        System.out.println("参数值： --"+param);
        return "@RequestParam\n" +
                "name代表提交参数名。\n" +
                "required意思是这个参数是否必需，默认true，没有该参数，无法调用此方法；这里设为false，有无该参数都可以调用。\n" +
                "defaultValue如果该参数值为空，那么就使用默认值。";
    }

    /**
     * http://localhost:8989/api/get-info/{'json':'3452'}
     * 我们可以在请求方法后面直接跟值，省去了 ？参数名= 。
     * 这种一般配合 @DeleteMapping、@PutMapping使用。
     * @param param
     * @return
     */
    @RequestMapping("/get-info/{param}")
    public String getInfo(@PathVariable("param") Object param){
        System.out.println(param);
        return "@PathVariable";
    }

}
