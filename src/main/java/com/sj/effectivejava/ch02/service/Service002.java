package com.sj.effectivejava.ch02.service;

import com.sj.effectivejava.ch02.dto.NutritionFactForm;
import com.sj.effectivejava.ch02.entity.NutritionFact;
import com.sj.effectivejava.ch02.repository.NutritionFactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class Service002 {

    private final NutritionFactRepository nutritionFactRepository;

    public NutritionFactForm addNutritionFact(NutritionFactForm nutritionFactForm) {
        NutritionFact nutritionFact = NutritionFact.builder(nutritionFactForm.getServingSize(), nutritionFactForm.getServings())
                .calories(nutritionFactForm.getCalories())
                .fat(nutritionFactForm.getFat())
                .solium(nutritionFactForm.getSolium())
                .carbohydrate(nutritionFactForm.getCarbohydrate())
                .build();
        return NutritionFactForm.from(nutritionFactRepository.save(nutritionFact));
    }

}
