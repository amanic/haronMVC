package mvc.controller;

import mvc.objects.ResultApi;
import mvc.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by martea on 2018/8/23.
 */
@Controller
@RequestMapping("test")
public class TestController {


    @Autowired
    TestService testService;

    @InitBinder
    public void initBinder(WebDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy---MM---dd HH:mm:ss");
        CustomDateEditor dateEditor = new CustomDateEditor(df, true);
        binder.registerCustomEditor(Date.class, dateEditor);
    }


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

    @RequestMapping(value = "test4")
    @ResponseBody
    public ResultApi<String> test4(){
        return ResultApi.successItem(testService.testString1(""));
    }


    @RequestMapping(value = "test5")
    @ResponseBody
    public ResultApi<String> test5(){
        return ResultApi.successItem(testService.testString1(""));
    }

    @RequestMapping(value = "test6")
    @ResponseBody
    public String test6(){
        return testService.testString3("");
    }

    @RequestMapping(value = "test7")
    @ResponseBody
    public String test7(){
        return testService.testString4("");
    }

    /**
     * 测试{@link InitBinder}
     * @param date
     * @return
     */
    @RequestMapping(value="test8",method= RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> test8(Date date){
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("name","lg");
        map.put("age",23);
        map.put("date",new Date());
        map.put("old",date);
        return map;
    }
}
