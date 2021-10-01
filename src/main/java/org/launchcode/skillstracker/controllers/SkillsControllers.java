package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsControllers {

    @GetMapping
    @ResponseBody
    public String skills(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String skillsForm() {
        return "<html>" +
                "<body>" +
                "<form action = 'form'  method='post'" +
                "<label>Name: </label><br>" +
                "<input type='text' name='name'><br>" +
                "<label>My favorite language: </label><br>" +
                "<select name='firstFavorite' id='firstFavorite'><br>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScrip'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "</label>" +
                "<label>My second favorite language: </label><br>" +
                "<select name='secondFavorite' id='secondFavorite'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "</label>" +
                "<label>My third favorite language: </label><br>" +
                "<select name='thirdFavorite' id='thirdFavorite'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScrip'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "</label>" +
                "<input type='submit' value='submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping(value="form")
    @ResponseBody
    public String skillPost(@RequestParam String name, String firstFavorite, String secondFavorite, String thirdFavorite) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstFavorite + "</li>" +
                "<li>" + secondFavorite + "</li>" +
                "<li>" + thirdFavorite + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
}
