package BoECdemo.webs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeView {
	@RequestMapping(value="/")
    public String ViewHome(){
        return "login";
    }
	@RequestMapping(value="/index",method = RequestMethod.GET)
    public String viewIndex(){
        return "index";
    }
	@RequestMapping(value="/register",method = RequestMethod.GET)
    public String viewRegister(){
        return "register";
    }
	@RequestMapping(value="/cart",method = RequestMethod.GET)
    public String viewCart(){
        return "cart";
    }
}
