package pl.edu.wszib.shopthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @GetMapping({"", "product"})
    public String products(Model model){
        model.addAttribute("hello", "Cześć");
        return "products";
    }

}
