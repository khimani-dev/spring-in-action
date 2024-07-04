package com.tacocloudapplication;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TacoOrder {
    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccCCV;
    private String ccNumber;
    private String ccExpiration;

    private List<Taco> tacos=new ArrayList<>(); //method for easier addition of tacos
    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
}
