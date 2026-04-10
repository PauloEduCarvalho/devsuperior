package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.OrderItem;

public class OrderItemDTO {
        
    private Long productId;
    private String name;
    private Double price;
    private Integer quantity;
    
    public OrderItemDTO() {
    }
    
    public OrderItemDTO(Long productId, String name, Integer quantity, Double price) {
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    
    public OrderItemDTO(OrderItem dto) {
        productId = dto.getProduct().getId();
        name = dto.getProduct().getName();
        price = dto.getProduct().getPrice();
        quantity = dto.getQuantity();
    }

    public Long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }
    
    public Integer getQuantity() {
        return quantity;
    }
    
    public Double getPrice() {
        return price;
    }

    public Double getSubTotal() {
        return price * quantity;
    }
}
