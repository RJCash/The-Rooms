package com.theironyard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;

@Controller
public class MyController {
    @Autowired
    GroupRepository repo;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String Home(Model model, @RequestParam(defaultValue = "") String day,@RequestParam(defaultValue = "0.0") final Double currentLat, @RequestParam(defaultValue = "0.0") final Double currentLong) {
        System.out.println(currentLat+" "+currentLong);
        model.addAttribute("day", day);
        model.addAttribute("groups", repo.quickFind(LocalDateTime.now().getDayOfWeek().toString(),currentLat,currentLong));
        model.addAttribute("groupsMonday", repo.listGroups("Monday",currentLat,currentLong));
        model.addAttribute("groupsTuesday", repo.listGroups("Tuesday",currentLat,currentLong));
        model.addAttribute("groupsWednesday", repo.listGroups("Wednesday",currentLat,currentLong));
        model.addAttribute("groupsThursday", repo.listGroups("Thursday",currentLat,currentLong));
        model.addAttribute("groupsFriday", repo.listGroups("Friday",currentLat,currentLong));
        model.addAttribute("groupsSaturday", repo.listGroups("Saturday",currentLat,currentLong));
        model.addAttribute("groupsSunday", repo.listGroups("Sunday",currentLat,currentLong));

        return "index";
    }
    @RequestMapping("/meeting")
    public String meetingPage(Model model, Integer id){
        if(id != null){
                model.addAttribute("group", repo.specificGroup(id));
            }else{
                model.addAttribute("group", new Group());
            }
            return "meeting";
        }
    @RequestMapping("/counter")
    public String counter(){
        return "counter";
    }
    @RequestMapping("/location")
    public String location(Model model, Integer id){
        if(id != null){
            model.addAttribute("group", repo.specificGroup(id));
            model.addAttribute("groupLatitude", repo.specificGroup(id).getLatitude());
            model.addAttribute("groupLongitude", repo.specificGroup(id).getLongitude());
            model.addAttribute("groupMiles", repo.specificGroup(id).getMiles());
        }else{
            model.addAttribute("group", new Group());
        }

        return "Location";
    }

}


