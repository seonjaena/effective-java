package com.sj.effectivejava.ch02.controller;

import com.sj.effectivejava.ch02.dto.LaptopForm;
import com.sj.effectivejava.ch02.service.Service001;
import com.sj.effectivejava.ch02.test.NutritionFactsTest02;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/item001")
public class Controller001 {

    private final Service001 service001;

    @PostMapping
    public LaptopForm addLaptop(@RequestBody LaptopForm laptopForm) {
        return LaptopForm.from(service001.addLaptop(laptopForm));
    }

}
