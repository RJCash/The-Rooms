package com.theironyard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by rickiecashwell on 4/28/17.
 */
@Controller
public class MyController {
@Autowired
GroupRepository repo;

    @RequestMapping("/")
    public String Home(Model model, @RequestParam(defaultValue = "Monday") String day){

        model.addAttribute("groups",repo.listGroups(day));
        return "index";
    }

}
