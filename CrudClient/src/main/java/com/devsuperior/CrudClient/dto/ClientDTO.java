package com.devsuperior.CrudClient.dto;

import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF;

import com.devsuperior.CrudClient.entities.Client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;

public class ClientDTO {
    
    private Long id;

    @NotBlank(message = "Campo obrigatório")
    private String name;

    @NotBlank(message = "Campo obrigatório")
    @CPF(message = "CPF inválido")
    private String cpf;

    @NotNull(message = "Renda é obrigatória")
    @Positive(message = "Renda deve ser positiva")
    private Double income;

    @PastOrPresent(message = "A data de nascimento não pode ser futura")
    private LocalDate birthDate;
    
    @NotNull(message = "Quantidade de filhos é obrigatória")
    private Integer children;

    public ClientDTO() {
    }

    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClientDTO(Client entity) {
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        birthDate = entity.getBirthDate();
        children = entity.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}
