package com.suleware.springboot.di.invoice.springboot_di_invoice;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.suleware.springboot.di.invoice.springboot_di_invoice.models.Item;
import com.suleware.springboot.di.invoice.springboot_di_invoice.models.Product;

@Configuration
@PropertySource("classpath:/data.properties")
public class AppConfig {

    @Bean
    List<Item> invoiceItems() {
        Product p1 = new Product("Sony Camera", 200);
        Product p2 = new Product("Razer Keyboard", 125);
        Product p3 = new Product("Lenovo Thinkpad", 500);
        Item i1 = new Item(p1, 5);
        Item i2 = new Item(p2, 2);
        Item i3 = new Item(p3, 1);
        return Arrays.asList(i1, i2, i3);
    }

}