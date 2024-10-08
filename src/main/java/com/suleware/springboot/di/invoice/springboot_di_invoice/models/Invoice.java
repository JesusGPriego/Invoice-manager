package com.suleware.springboot.di.invoice.springboot_di_invoice.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Component
public class Invoice {

    private Client client;
    @Value("${invoice.description}")
    private String description;
    private List<Item> items;

    public Invoice(List<Item> items) {
        this.items = items; 
    }

}
