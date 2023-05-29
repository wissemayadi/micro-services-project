package com.example.msstock.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.BaseEntity;

import javax.persistence.Entity;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Stock extends BaseEntity {

    private String name;
    private int qtite;

}

