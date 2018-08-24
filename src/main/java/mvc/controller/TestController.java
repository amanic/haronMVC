package mvc.controller;

import mvc.objects.ResultApi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by martea on 2018/8/23.
 */
@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping(value = "test1")
    @ResponseBody
    public String test1(@RequestParam("param") String param){
        System.out.println(param);
        return "hello "+param;
    }

    @RequestMapping(value = "test2")
    @ResponseBody
    public ResultApi<String> test2(@RequestParam("param") String param){
        return ResultApi.successItem(param);
    }


    @RequestMapping(value = "test3", produces = "application/json;charset=utf-8",consumes ="application/json;charset=utf-8")
    public void response2(HttpServletResponse response) throws IOException {
        //表示响应的内容区数据的媒体类型为json格式，且编码为utf-8(客户端应该以utf-8解码)
//        response.setContentType("application/text;charset=utf-8");
        //写出响应体内容
        String jsonData = "{\"username\":\"zhang\", \"password\":\"123\"}";
        response.getWriter().write(jsonData);
    }


}
