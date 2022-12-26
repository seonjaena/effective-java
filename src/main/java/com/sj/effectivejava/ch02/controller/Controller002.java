package com.sj.effectivejava.ch02.controller;

import com.sj.effectivejava.ch02.dto.NutritionFactForm;
import com.sj.effectivejava.ch02.entity.NutritionFact;
import com.sj.effectivejava.ch02.service.Service002;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/item002")
public class Controller002 {

    private final Service002 service002;

    @PostMapping
    public NutritionFactForm addNutritionFact(@RequestBody NutritionFactForm nutritionFactForm) {
        return service002.addNutritionFact(nutritionFactForm);
    }

}
