package com.sj.effectivejava.ch02.dto;

import com.sj.effectivejava.ch02.entity.NutritionFact;
import lombok.*;

@Getter
@Builder(builderMethodName = "innerBuilder")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class NutritionFactForm {

    private int servingSize;
    private int servings;
    @Builder.Default
    private int calories = 0;
    @Builder.Default
    private int fat = 0;
    @Builder.Default
    private int solium = 0;
    @Builder.Default
    private int carbohydrate = 0;

    public NutritionFactFormBuilder builder(int servingSize, int servings) {
        return innerBuilder()
                .servingSize(servingSize)
                .servings(servings);
    }

    public static NutritionFactForm from(NutritionFact nutritionFact) {
        NutritionFactForm nutritionFactForm = new NutritionFactForm();
        nutritionFactForm.servingSize = nutritionFact.getServingSize();
        nutritionFactForm.servings = nutritionFact.getServings();
        nutritionFactForm.calories = nutritionFact.getCalories();
        nutritionFactForm.fat = nutritionFact.getFat();
        nutritionFactForm.solium = nutritionFact.getSolium();
        nutritionFactForm.carbohydrate = nutritionFact.getCarbohydrate();
        return nutritionFactForm;
    }

}
