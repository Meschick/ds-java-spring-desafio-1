package com.devsuperior.des1.services;

import com.devsuperior.des1.entities.Order;
import com.devsuperior.des1.entities.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService service;

    public double total(Order order){

        double valorTotalDesconto = order.getValueBasic() - ( order.getValueBasic() * (order.getDiscout() / 100 ) );
        order.setValueBasic(valorTotalDesconto);
        return service.shipment(order);
    }
}
