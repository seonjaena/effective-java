package com.sj.effectivejava.ch02.dto;

import com.sj.effectivejava.ch02.entity.Laptop;
import lombok.Getter;

@Getter
public class LaptopForm {

    private String name;
    private String corp;

    public static LaptopForm from(Laptop laptop) {
        LaptopForm laptopForm = new LaptopForm();
        laptopForm.name = laptop.getModelName();
        laptopForm.corp = laptop.getCompany();
        return laptopForm;
    }

}
