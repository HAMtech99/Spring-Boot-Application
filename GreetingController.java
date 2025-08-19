package com.example.handlingformsubmission;

//Spring annotations and classes for web controllers and form handling
import org.springframework.stereotype.Controller; // Tells spring "this is a web controller"
import org.springframework.ui.Model; // Used to pass data to the view
import org.springframework.web.bind.annotation.GetMapping; // Maps HTTP GET requests
import org.springframework.web.bind.annotation.ModelAttribute; // Binds form input to object
import org.springframework.web.bind.annotation.PostMapping; // Maps HTTP POST requests


// Declares this class as the controller in the Spring MVC
@Controller
public class GreetingController {

    // Handles GET requests to "/greeting" - shows the form
    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting()); // Adds empty greeting object to the model
        return "greeting"; // Tells thymeleaf to render greeting.html
    }


    // Handles POST requests to "/greeting" - processes the form submission
    @PostMapping("/greeting")
    // @ModelAttribute binds form fields to the Greeting object
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model)  {
        model.addAttribute("greeting", greeting);  // Model attribute binds form fields to the greeting object
        return "result"; // Tells Thymeleaf to render result.html
    }

}