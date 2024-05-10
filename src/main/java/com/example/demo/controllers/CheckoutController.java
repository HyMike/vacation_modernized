package com.example.demo.controllers;

import com.example.demo.dto.Purchase;
import com.example.demo.dto.PurchaseResponse;
import com.example.demo.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.PrinterURI;

@CrossOrigin
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {
    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
       this.checkoutService = checkoutService;
        }
        @PostMapping("/purchase")
        public PurchaseResponse placeOrder(@RequestBody Purchase purchase){
            PurchaseResponse purchaseResponse = checkoutService.placeCart(purchase);
            return purchaseResponse;



    }


}
