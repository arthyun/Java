package practice.springBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello (Model model){
        model.addAttribute("data", "SpringBoot!!"); // { data : hello!! }로 할당
        return "hello"; // templates 폴더 하위 html명을 기준으로 찾음
    }

}
