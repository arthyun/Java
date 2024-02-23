package practice.springBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello (Model model){
        model.addAttribute("data", "SpringBoot!!"); // { data : "SpringBoot!!" }로 할당
        return "hello"; // templates 폴더 하위 html명을 return값 기준으로 찾음
    }
}
