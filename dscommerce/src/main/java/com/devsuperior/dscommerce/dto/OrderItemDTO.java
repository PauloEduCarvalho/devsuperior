package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.OrderItem;

public class OrderItemDTO {
        
    private Long productId;
    private String name;
    private Double price;
    private Integer quantity;
    private String imageUrl;
    
    public OrderItemDTO() {
    }
    
    public OrderItemDTO(Long productId, String name, Integer quantity, Double price, String imageUrl) {
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.imageUrl = imageUrl;
    }
    
    public OrderItemDTO(OrderItem dto) {
        productId = dto.getProduct().getId();
        name = dto.getProduct().getName();
        price = dto.getProduct().getPrice();
        quantity = dto.getQuantity();
        imageUrl = dto.getProduct().getImgUrl();
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

    public String getImageUrl() {
        return imageUrl;
    }
}
