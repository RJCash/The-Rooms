package com.theironyard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rickiecashwell on 4/28/17.
 */
@Controller
public class MyController {

    @RequestMapping("/")
    public String Home(){
        return null;
    }
}
