package BoECdemo.webs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeView {
	@RequestMapping(value="/")
    public String ViewHome(){
        return "login";
    }
}
