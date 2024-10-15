package com.infbio.springboot.simpletodo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    // /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
    /*
    RequestMapping + ResponseBody로 했더니, jsp로 매핑이 안되고
    GetMapping을 사용했더니 됨
     */
    @GetMapping("say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }
}
