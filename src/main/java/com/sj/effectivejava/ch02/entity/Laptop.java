package com.sj.effectivejava.ch02.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "LAPTOP")
@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Laptop {

    @Id
    @Column(name = "LAPTOP_IDX")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "MODEL_NAME")
    private String modelName;

    @Column(name = "COMPANY")
    private String company;

    public static Laptop ofModelNameAndCompany(String modelName, String company) {
        Laptop laptop = new Laptop();
        laptop.modelName = modelName;
        laptop.company = company;
        return laptop;
    }

}
