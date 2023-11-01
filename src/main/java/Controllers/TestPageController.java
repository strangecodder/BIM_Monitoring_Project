package Controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class TestPageController {

    @GetMapping("/")
    public String testPage(){
        return "testPage";
    }
}
// TODO: 01.11.2023 add methods for adding materials and other methods for communication with database  
