package com.devsuperior.aula.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.aula.entities.Order;

@Service
public class OrderService {
    
    @Autowired
	private ShippingService shipping;
    
    public double total(Order order) {
        return order.getBasic() - (order.getBasic() * order.getDiscount() / 100.0) + shipping.shipment(order);
    }
}
