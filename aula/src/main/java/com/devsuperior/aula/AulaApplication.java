package com.devsuperior.aula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.aula.entities.Order;
import com.devsuperior.aula.services.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {
	
	@Autowired
	private OrderService orderService;
	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1034, 150.0, 20.0);
		System.out.println("Pedido Código " + order.getCode());
		System.out.println("Valor Total: R$" + orderService.total(order));
		Order order2 = new Order(2282, 800.0, 10.0);
		System.out.println("Pedido Código " + order2.getCode());
		System.out.println("Valor Total: R$" + orderService.total(order2));
		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.println("Pedido Código " + order3.getCode());
		System.out.println("Valor Total: R$" + orderService.total(order3));
	}
}
