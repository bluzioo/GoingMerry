package demo.intellij.register.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HelloController {

    @Value("${demo.profile}")
    private String profile;


    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "hello ";
    }


    @RequestMapping("profile")
    @ResponseBody
    public String profile() {
        return "profile is " + profile;
    }

}
