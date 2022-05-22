package us.icarenow.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pages")
public class PagesController {
    @GetMapping("sign-in")
    private String getSignInPage(){
        return "pages/sign-in.html";
    }
}
