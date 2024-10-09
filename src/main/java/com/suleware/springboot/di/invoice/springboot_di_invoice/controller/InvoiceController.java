package com.suleware.springboot.di.invoice.springboot_di_invoice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suleware.springboot.di.invoice.springboot_di_invoice.models.Invoice;

@RestController
@RequestMapping("/api/invoice")
public class InvoiceController {

    private Invoice invoice;

    public InvoiceController(Invoice invoice) {
        this.invoice = invoice;
    }

    @GetMapping
    public Invoice show() {
        return invoice;
    }

}
