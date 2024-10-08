package com.suleware.springboot.di.invoice.springboot_di_invoice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Item {

    private Product product;
    private Integer quantity;

}
