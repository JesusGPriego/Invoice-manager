package com.suleware.springboot.di.invoice.springboot_di_invoice.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Component
public class Client {
    
    @Value("${client.name}")
    private String name;
    @Value("${client.lsatname}")
    private String lastname;

}
