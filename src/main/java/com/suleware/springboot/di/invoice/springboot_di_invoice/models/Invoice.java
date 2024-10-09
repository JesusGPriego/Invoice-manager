package com.suleware.springboot.di.invoice.springboot_di_invoice.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class Invoice {

    private Client client;
    @Value("${invoice.description}")
    private String description;
    private List<Item> items;

    public Invoice(Client client, List<Item> items) {
        this.client = client;
        this.items = items;
    }

    public Integer getInvoiceTotal() {
        return items.stream()
                .map(Item::getAmount)
                .reduce(0, (acc, item) -> acc + item);
    }
}
