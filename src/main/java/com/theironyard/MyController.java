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
    public String Home(Model model, @RequestParam(defaultValue = "") String day){
        model.addAttribute("day", day);
        model.addAttribute("groupsMonday",repo.listGroups("Monday"));
        model.addAttribute("groupsTuesday",repo.listGroups("Tuesday"));
        model.addAttribute("groupsWednesday",repo.listGroups("Wednesday"));
        model.addAttribute("groupsThursday",repo.listGroups("Thursday"));
        model.addAttribute("groupsFriday",repo.listGroups("Friday"));
        model.addAttribute("groupsSaturday",repo.listGroups("Saturday"));
        model.addAttribute("groupsSunday",repo.listGroups("Sunday"));
        return "index";
    }

    @RequestMapping("/nearest")
    public String near(double lat, double lon, Model model){

        //model.addAttribute("nearest", repo.getNearest(35.7,-78.6));

        return "meetingHtML";
    }
    @RequestMapping("/matchingMeetings")
    public String matchingMeetings(){
        return "meetingList";
    }

    @RequestMapping("/meeting")
    public String meetingPage(){


        return "meeting";
    }
}
