package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

//    @GetMapping("/testPage")
//    public String testPageRedirect(){
//        return "redirect:/testPage";
//    }
}
// TODO: 01.11.2023 add redirected methods (to orderpage, testpage and monitoring page)