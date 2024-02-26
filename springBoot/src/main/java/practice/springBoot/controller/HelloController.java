package practice.springBoot.controller;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//@RestController
@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello (Model model){
        model.addAttribute("data", "SpringBoot!!"); // { data : "SpringBoot!!" }로 할당
        return "hello"; // templates 폴더 하위 html명을 return값 기준으로 찾음
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
        return "hello-mvc";
    }

    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name){
        return "hello " + name; // 입력한 param에 따라 body값을 내려줌
    }

    /* 실제 사용 방식(json을 만들어줌~) */
    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello(); // 아래에서 생성한 클래스로 인스턴스를 만듬
        hello.setName(name);
        return hello;
    }
    /* getter/setter 클래스 생성 */
    static class Hello {
        private String name;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
}
