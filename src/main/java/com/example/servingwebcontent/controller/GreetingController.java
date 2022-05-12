package com.example.servingwebcontent.controller;

        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
    /*
        Result:
        Whitelabel Error Page

        This application has no explicit mapping for /error, so you are seeing this as a fallback.
        Sat May 07 11:33:48 EDT 2022
        There was an unexpected error (type=Not Found, status=404).
        No message available

        WHAT IS THE CAUSE OF THIS ERROR AND HOW CAN IT BE AVOIDED?

        
     */

}