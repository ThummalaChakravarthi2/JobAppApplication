
package com.chakri.springweb2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.chakri.springweb2.service.jobService;

import org.springframework.ui.Model;

@Controller
public class HomeController {
	@Autowired
    private jobService service; 

    @GetMapping({"/","/home"})
    public String home() {
        System.out.println("Home method called");
        return "home";
    }

    @GetMapping("/addjob")
    public String addjob() {
        System.out.println("add job called");
        return "addjob";
    }

    }
}
