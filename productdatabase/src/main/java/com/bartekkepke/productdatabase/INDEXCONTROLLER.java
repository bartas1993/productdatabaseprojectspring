package com.bartekkepke.productdatabase;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class INDEXCONTROLLER {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    @GetMapping
    String getProducts(Model model)
    {

        model.addAttribute("WelcomeMessage","From here you can add/update/delete, products/users/suppliers");
        return "INDEXPAGE";
    }
}
