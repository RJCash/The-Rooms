package com.theironyard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
    @Autowired
    GroupRepository repo;

    @RequestMapping("/")
    public String Home(Model model, @RequestParam(defaultValue = "") String day) {
        model.addAttribute("day", day);
        model.addAttribute("groupsMonday", repo.listGroups("Monday"));
        model.addAttribute("groupsTuesday", repo.listGroups("Tuesday"));
        model.addAttribute("groupsWednesday", repo.listGroups("Wednesday"));
        model.addAttribute("groupsThursday", repo.listGroups("Thursday"));
        model.addAttribute("groupsFriday", repo.listGroups("Friday"));
        model.addAttribute("groupsSaturday", repo.listGroups("Saturday"));
        model.addAttribute("groupsSunday", repo.listGroups("Sunday"));
        return "index";
    }


    @GetMapping("/meeting")
    public String Meeting(ModelMap model, Integer meetingId) {
        model.put("meeting", repo.getGroups(meetingId));
        return "meeting";
    }
}
