package controller;

import io.datajek.springmvc.Athlete;
import io.datajek.springmvc.PlayerStats;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class StatsController {
    @RequestMapping("/showStatsForm")
    public String showForm(Model model){
        model.addAttribute("playerStats", new PlayerStats());
        return "head-to-head";
    }

    public static String processStatsForm(@Valid @ModelAttribute("playerStats") PlayerStats playerStats, BindingResult result){
        if(result.hasErrors()){
            System.out.println("Binding result: " + result);
            return "head-to-head";
        }
        else{
            return "stats-confirmation";
        }
    }
}
