package com.devsuperior.des1.entities;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order){
        double value = order.getValueBasic();

        if(value < 100.00){
            return value + 20.00;
        }else if( value > 100 && value < 200){
            return value + 12.00;
        }else {
            return value;
        }
    }
}
