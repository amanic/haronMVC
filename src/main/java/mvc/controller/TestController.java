package mvc.controller;

import mvc.objects.ResultApi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by martea on 2018/8/23.
 */
@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping(value = "test1")
    public String test1(@RequestParam("param") String param){
        System.out.println(param);
        return "hello";
    }

    @RequestMapping(value = "test2")
    @ResponseBody
    public ResultApi<String> test2(@RequestParam("param") String param){
        return ResultApi.successItem(param);
    }



}
