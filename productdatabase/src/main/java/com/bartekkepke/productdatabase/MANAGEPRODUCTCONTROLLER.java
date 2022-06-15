package com.bartekkepke.productdatabase;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MANAGEPRODUCTCONTROLLER {


    @RequestMapping(value = "/manageProducts", method = RequestMethod.GET)
    @GetMapping
    public String getAddProductPage(Model ProductModel)
    {
        return "MANAGEPRODUCTS";
    }
}
