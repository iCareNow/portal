package us.icarenow.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("sign-up")
public class SignUpController {
    @GetMapping("sign-up")
    private String getSignInPage(){
        return "sign-up.html";
    }
}
