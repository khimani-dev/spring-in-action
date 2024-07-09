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
    private String ccCVV;
    private String ccNumber;
    private String ccExpiration;

    private List<Taco> tacos=new ArrayList<>(); //avoids hard-coding gives the flexibility of controlling the no. of tacos
    public void addTaco(Taco taco) {  //method for easier addition of tacos
        this.tacos.add(taco);
    }
}
